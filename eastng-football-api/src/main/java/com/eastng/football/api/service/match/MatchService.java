package com.eastng.football.api.service.match;

import java.util.List;

import com.eastng.football.api.vo.MatchVO;
import com.eastng.football.api.vo.QueryMatchParamVO;


/**
 * 赛事服务接口
 * @author caojia
 */
public interface MatchService {
	
	/**
	 * 保存比赛信息
	 * @param matchVO
	 * @return
	 */
	public Integer saveMatch(MatchVO matchVO);
	
	/**
	 * 根据条件查询比赛信息
	 * @param paramVO
	 * @return
	 */
	public List<MatchVO> queryMatchSchedule(QueryMatchParamVO paramVO);

	/**
	 * 根据赛事种类ID查询联赛或杯赛信息
	 * @param eventId
	 */
	public void querySeasonListByEventId(String eventId);
	
	/**
	 * 根据条件查询赛季详情
	 * @param eventId
	 * @param seasonName
	 */
	public void querySeasonInfoByCondition(String eventId,String seasonName);
	
	/**
	 * 查询两队历史交战记录
	 * @param hostTeamId
	 * @param guestTeamId
	 */
	public void queryMatchHistoryByTeams(String hostTeamId,String guestTeamId);
}