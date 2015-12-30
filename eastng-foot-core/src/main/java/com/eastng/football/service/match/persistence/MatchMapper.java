package com.eastng.football.service.match.persistence;

import org.apache.ibatis.annotations.Select;

import com.eastng.football.entity.match.Match;

/**
 * 比赛Mapper接口
 * @author caojia
 */
public interface MatchMapper {

	/**
	 * 保存比赛信息，采用XML方式映射
	 * @param match
	 * @return 保存记录数
	 */
	Integer saveMatch(Match match);
	
	/**
	 * 根据比赛编号查询比赛详细信息，采用注解方式映射
	 * @param matchNo
	 * @return
	 */
	@Select("select * from t_match where id = #{matchNo}")
	Match selectMatch(String matchNo);
}