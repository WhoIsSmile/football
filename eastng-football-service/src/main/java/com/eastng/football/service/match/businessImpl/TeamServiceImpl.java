package com.eastng.football.service.match.businessImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eastng.football.api.service.match.TeamService;
import com.eastng.football.api.vo.match.TeamVO;
import com.eastng.football.core.entity.match.Team;
import com.eastng.football.core.service.match.persistence.TeamMapper;
import com.eastng.football.util.BeanUtils;
import com.eastng.football.util.GenerateCodeUtil;

/**
 * 球队信息服务实现类
 * @author caojia
 */
@Service("teamService")
public class TeamServiceImpl implements TeamService {
	
	@Autowired
	private TeamMapper teamMapper;
	
	public Integer saveTeam(TeamVO paramVO) {
		
		Team record = new Team();
		//球队编号
		record.setTeamNo(paramVO.getTeamNo());
		 /**球队类型  0：国家队；1：俱乐部 */
		record.setTeamType(paramVO.getTeamType());
		//球队全称
		record.setTeamName(paramVO.getTeamName());
		//球队简称
		record.setShortName(paramVO.getShortName());
		//球队英文名称
		record.setTeamNameEng(paramVO.getTeamNameEng());
		//建立时间
		record.setEstablishDate(paramVO.getEstablishDate());
		//所属洲
		record.setContinent(paramVO.getContinent());
		//所属国家
		record.setCountry(paramVO.getCountry());
		
		Integer result = this.teamMapper.insertSelective(record);
		return result;
	}

	/**
	 * 保存球队信息列表
	 */
	public Integer saveTeams(List<TeamVO> list) {
		List<Team> teams = new ArrayList<Team>();
		for(TeamVO teamVO : list){
			Team record = new Team();
			BeanUtils.copyProperties(teamVO, record);
			record.setTeamNo(GenerateCodeUtil.generateTeamNo());
			teams.add(record);
		}
		int i = this.teamMapper.batchInsert(teams);
		return i;
	}

}