package com.eastng.football.core.entity.match;

import java.util.Date;

public class Team {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team.ID
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team.TEAM_NO
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    private String teamNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team.TEAM_NAME
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    private String teamName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team.SHORT_NAME
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    private String shortName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team.TEAM_NAME_ENG
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    private String teamNameEng;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team.TEAM_TYPE
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    private String teamType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team.CONTINENT
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    private String continent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team.COUNTRY
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    private String country;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team.ESTABLISH_DATE
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    private Date establishDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team.ID
     *
     * @return the value of t_team.ID
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team.ID
     *
     * @param id the value for t_team.ID
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team.TEAM_NO
     *
     * @return the value of t_team.TEAM_NO
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public String getTeamNo() {
        return teamNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team.TEAM_NO
     *
     * @param teamNo the value for t_team.TEAM_NO
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public void setTeamNo(String teamNo) {
        this.teamNo = teamNo == null ? null : teamNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team.TEAM_NAME
     *
     * @return the value of t_team.TEAM_NAME
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team.TEAM_NAME
     *
     * @param teamName the value for t_team.TEAM_NAME
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team.SHORT_NAME
     *
     * @return the value of t_team.SHORT_NAME
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team.SHORT_NAME
     *
     * @param shortName the value for t_team.SHORT_NAME
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team.TEAM_NAME_ENG
     *
     * @return the value of t_team.TEAM_NAME_ENG
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public String getTeamNameEng() {
        return teamNameEng;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team.TEAM_NAME_ENG
     *
     * @param teamNameEng the value for t_team.TEAM_NAME_ENG
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public void setTeamNameEng(String teamNameEng) {
        this.teamNameEng = teamNameEng == null ? null : teamNameEng.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team.TEAM_TYPE
     *
     * @return the value of t_team.TEAM_TYPE
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public String getTeamType() {
        return teamType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team.TEAM_TYPE
     *
     * @param teamType the value for t_team.TEAM_TYPE
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public void setTeamType(String teamType) {
        this.teamType = teamType == null ? null : teamType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team.CONTINENT
     *
     * @return the value of t_team.CONTINENT
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public String getContinent() {
        return continent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team.CONTINENT
     *
     * @param continent the value for t_team.CONTINENT
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public void setContinent(String continent) {
        this.continent = continent == null ? null : continent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team.COUNTRY
     *
     * @return the value of t_team.COUNTRY
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team.COUNTRY
     *
     * @param country the value for t_team.COUNTRY
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team.ESTABLISH_DATE
     *
     * @return the value of t_team.ESTABLISH_DATE
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public Date getEstablishDate() {
        return establishDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team.ESTABLISH_DATE
     *
     * @param establishDate the value for t_team.ESTABLISH_DATE
     *
     * @mbggenerated Sun Jan 03 13:46:51 CST 2016
     */
    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }
}