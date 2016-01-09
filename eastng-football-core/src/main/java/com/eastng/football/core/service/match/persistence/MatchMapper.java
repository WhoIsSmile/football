package com.eastng.football.core.service.match.persistence;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.eastng.football.core.entity.match.Match;
import com.eastng.football.core.entity.match.MatchExample;

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
	 * 根据条件查询赛程信息
	 * @param match
	 * @return 赛程信息列表
	 */
	List<Match> queryMatchByCondition(Map<String,Object> map);
	
	/**
	 * 根据比赛编号查询比赛详细信息，采用注解方式映射
	 * @param matchNo
	 * @return
	 */
	@Select("select * from t_match where match_no = #{matchNo}")
	Match selectMatchByMatchNo(String matchNo);
	
	/**
	 * Mybatis-Generator生成的复杂查询方法
	 * @param example 查询辅助类
	 * @return 比赛列表
	 */
	List<Match> selectByExample(MatchExample example);
	
	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match
     *
     * @mbggenerated Thu Jan 07 16:51:55 CST 2016
     */
    int deleteByExample(MatchExample example);
    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match
     *
     * @mbggenerated Thu Jan 07 16:51:55 CST 2016
     */
    int updateByExampleSelective(@Param("record") Match record, @Param("example") MatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match
     *
     * @mbggenerated Thu Jan 07 16:51:55 CST 2016
     */
    int updateByExample(@Param("record") Match record, @Param("example") MatchExample example);

}
