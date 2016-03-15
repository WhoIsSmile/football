package com.eastng.football.business;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eastng.football.api.constant.CommonConstant;
import com.eastng.football.api.exception.FootBallBizException;
import com.eastng.football.api.service.lottery.OddsService;
import com.eastng.football.api.service.match.MatchService;
import com.eastng.football.api.vo.lottery.OddsVO;
import com.eastng.football.api.vo.match.MatchVO;

public class CrawlerFootball {
	
	//Ӣ��2015/2016����
	public void crawler(Document doc,String leagueNo,String seasonName){
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
		MatchService matchService = (MatchService) classPathXmlApplicationContext.getBean("matchService");
		OddsService oddsService = (OddsService) classPathXmlApplicationContext.getBean("oddsService");
		
		Elements elements = doc.select("#team_fight_table tr");
        for(Element element:elements){
       	 Elements s = element.select("td");
       	 
       	//����ʱ��
    	String matchTime = s.get(0).text();
    		if(matchTime.equals("ʱ��")){
    			continue;
    		}
       	 
       	 //�ȷ�
		String score = s.get(3).text();
		
       	 //��������
   		 MatchVO matchVO = new MatchVO();
   		 
   		 String matchTimeSubstr = matchTime.substring(0, 2);
   		 if(Integer.parseInt(matchTimeSubstr)>=8){
   			 //ҳ����û����ݣ�8��֮��Ķ���ǰһ�꣬5��ǰ�ǵ��꣬Ӣ���������̵���8�µ���һ��5��
   			 matchTime = seasonName.substring(0,4)+"-"+matchTime;
   		 }else {
   			 matchTime = seasonName.substring(5,4)+"-"+matchTime;
			}
   		 SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
				try {
					Date beginDate = sdf1.parse(matchTime);
					matchVO.setMatchTime(beginDate);
				} catch (ParseException e) {
					e.printStackTrace();
				}
   		 
   		 //��������
   		 matchVO.setHostShortName(s.get(2).text());
   		 String r = s.get(1).text();
   		 try {
   			 //�ִ�
   			 matchVO.setRound(Integer.parseInt(r));
			} catch (RuntimeException e) {
				continue;
			}
   		//�Ͷ�����
   		matchVO.setGuestShortName(s.get(4).text());
   		//����ȷ�   ҳ���ϸ�ʽ:2-3,ȥ����ܣ���ȡ���Ͷӽ���
   		if(!StringUtils.isEmpty(score)){
				int matchScore = score.indexOf("-");
				if(matchScore>-1){
					String hostGoal = score.substring(0, matchScore);
					String guestGoal = score.substring(matchScore+1);
					if(!StringUtils.isEmpty(hostGoal)){
						matchVO.setHostGoal(Integer.parseInt(hostGoal));
					}
					if(!StringUtils.isEmpty(guestGoal)){
						matchVO.setGuestGoal(Integer.parseInt(guestGoal));
					}
					matchVO.setMatchStatus(CommonConstant.MATCH_STATUS_END);
				}else{
					//״̬
					matchVO.setMatchStatus(CommonConstant.MATCH_STATUS_NOT_BEGIN);
				}
			}
   		
   		//�������
   		matchVO.setLeagueNo(leagueNo);
   		//����
   		matchVO.setSeasonName(seasonName);
   		//���������Ϣ
   		String matchNo = "";
   		try {
   			System.out.println(ToStringBuilder.reflectionToString(matchVO, ToStringStyle.MULTI_LINE_STYLE));
   			matchNo = matchService.saveMatch(matchVO);
			System.out.println("���������Ϣ�ɹ�"+matchNo);
		} catch (FootBallBizException e1) {
			System.out.println(e1.getMessage());
			e1.printStackTrace();
		}
   		
   		//���������ȡ������Ϣ
   		if(matchVO.getMatchStatus().equals(CommonConstant.MATCH_STATUS_END)){
	   		Elements a = element.select("a");
	   		String odds = a.get(1).attr("href");
	   		//δ����ȡ��һ������
	   		if(s.get(3).text().equals("VS")){
	   			odds = a.get(0).attr("href");
	   		}
	   		System.out.println("http://www.okooo.com"+odds+"change/27/");
				try {
					Document oddsdoc = Jsoup.connect("http://www.okooo.com"+odds+"change/27/").get();
					Elements tr = oddsdoc.select("table tr");
					for(int i= 4;i<tr.size();i++){
						Elements td = tr.get(i).select("td");
						if(td.size()<5||StringUtils.isEmpty(td.get(0).text())){
							continue;
						}
						OddsVO oddsVO = new OddsVO();
						oddsVO.setMatchNo(matchNo);
						oddsVO.setCompany("Bet365");
						//���뿪��ʱ��
						oddsVO.setTimeLeft(td.get(1).text());
						oddsVO.setWin(new BigDecimal(td.get(2).text().substring(0, 4)));
						oddsVO.setDraw(new BigDecimal(td.get(3).text().substring(0, 4)));
						oddsVO.setLose(new BigDecimal(td.get(4).text().substring(0, 4)));
						String time = td.get(0).text().substring(0, 16);
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
						try {
							Date beginDate = sdf.parse(time);
							oddsVO.setChangeTime(beginDate);
						} catch (ParseException e) {
							e.printStackTrace();
						}
						 System.out.println(ToStringBuilder.reflectionToString(oddsVO, ToStringStyle.MULTI_LINE_STYLE));
						 //����������Ϣ
						 oddsService.saveOdds(oddsVO);
						 System.out.println("�������ʳɹ�");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					continue;
				}
	        }
        }
	}

}
