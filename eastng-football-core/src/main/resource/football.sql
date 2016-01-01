/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2015/12/26 11:44:46                          */
/*==============================================================*/


drop table if exists T_EVENT_INFO;

drop table if exists T_MATCH;

drop table if exists T_ODDS;

drop table if exists T_TEAM;

drop table if exists T_TEAM_CUP_SEASON;

drop table if exists T_TEAM_LUAGUE_SEASON;

/*==============================================================*/
/* Table: T_EVENT_INFO                                          */
/*==============================================================*/
create table T_EVENT_INFO
(
   ID                   bigint not null,
   EVENT_NAME           varchar(255),
   EVENT_SHORT_NAME     varchar(50),
   EVENT_TYPE           char comment '0������
            1������',
   CONTINENT            varchar(10),
   COUNTRY              varchar(50),
   primary key (ID)
);

/*==============================================================*/
/* Table: T_MATCH                                               */
/*==============================================================*/
create table T_MATCH
(
   ID                   bigint not null,
   MATCH_NO             varchar(32) comment '�������',
   HOST_TEAM_NO         varchar(32) comment '������ӱ��',
   HOST_SHORT_NAME      varchar(50) comment '���Ӽ��',
   GUEST_TEAM_NO        varchar(32) comment '�Ͷ���ӱ��',
   GUEST_SHORT_NAME     varchar(50) comment '�ͶӼ��',
   EVENT_ID             bigint,
   SEASON_NAME          varchar(50),
   MATCH_TIME           datetime comment '����ʱ��',
   ROUND                int comment '�ִ�',
   HOST_GOAL            int comment '���ӽ���',
   GUEST_GOAL           int comment '�Ͷӽ���',
   HALF_TIME_HOST_GOAL  int comment '�볡���ӽ���',
   HALF_TIME_GUEST_GOAL int comment '�볡�Ͷӽ���',
   MATCH_STATUS         char comment '0��δ��ʼ
            1��������
            2���ѽ���',
   primary key (ID)
);

/*==============================================================*/
/* Table: T_ODDS                                                */
/*==============================================================*/
create table T_ODDS
(
   ID                   bigint not null,
   MATCH_NO             varchar(32) not null,
   COMPANY              varchar(50),
   CHANGE_TIME          datetime,
   WIN                  decimal(5,2),
   DRAW                 decimal(5,2),
   LOSE                 decimal(5,2),
   FIRST_ODDS           char comment '0����
            1����',
   primary key (ID)
);

/*==============================================================*/
/* Table: T_TEAM                                                */
/*==============================================================*/
create table T_TEAM
(
   ID                   bigint not null,
   TEAM_NO              varchar(32) comment '��ӱ��',
   TEAM_NAME            varchar(255) comment '�������',
   SHORT_NAME           varchar(50) comment '��Ӽ��',
   TEAM_NAME_ENG        varchar(255) comment '���Ӣ����',
   TEAM_TYPE            char not null comment '0�����Ҷӣ�1�����ֲ�',
   CONTINENT            varchar(10) comment '0�����ޣ�Asia��
            1��ŷ�ޣ�Europe��
            2�����ޣ�Africa��
            3�����ޣ�America��
            4�������ޣ�Oceania��',
   COUNTRY              varchar(50) comment '��������',
   ESTABLISH_DATE       date comment '��������',
   primary key (ID)
);

/*==============================================================*/
/* Table: T_TEAM_CUP_SEASON                                     */
/*==============================================================*/
create table T_TEAM_CUP_SEASON
(
   ID                   bigint not null,
   TEAM_NO              bigint,
   TEAM_SHORT_NAME      varchar(50),
   CUP_ID               bigint,
   SEASON_NAME          varchar(50),
   HAVE_MATCH           int,
   WIN                  int,
   DRAW                 int,
   LOSE                 int,
   GOALS                int,
   FUMBLE               int,
   HOST_HAVE_MATCH      int,
   HOST_WIN             int,
   HOST_DRAW            int,
   HOST_LOSE            int,
   HOST_GOALS           int,
   HOST_FUMBLE          int,
   GUEST__HAVE_MATCH    int,
   GUEST_WIN            int,
   GUEST_DRAW           int,
   GUEST_LOSE           int,
   GUEST_GOALS          int,
   GUEST_FUMBLE         int,
   POINTS               int,
   GROUP_NAME           char,
   GROUP_RANKING        int,
   IS_RISE              char comment '0����
            1����',
   primary key (ID)
);

/*==============================================================*/
/* Table: T_TEAM_LUAGUE_SEASON                                  */
/*==============================================================*/
create table T_TEAM_LUAGUE_SEASON
(
   ID                   bigint not null,
   TEAM_NO              bigint,
   TEAM_SHORT_NAME      varchar(50),
   LEAGUE_ID            bigint,
   SEASON_NAME          varchar(50),
   HAVE_MATCH           int,
   WIN                  int,
   DRAW                 int,
   LOSE                 int,
   GOALS                int,
   FUMBLE               int,
   HOST_HAVE_MATCH      int,
   HOST_WIN             int,
   HOST_DRAW            int,
   HOST_LOSE            int,
   HOST_GOALS           int,
   HOST_FUMBLE          int,
   GUEST_HAVE_MATCH     int,
   GUEST_WIN            int,
   GUEST_DRAW           int,
   GUEST_LOSE           int,
   GUEST_GOALS          int,
   GUEST_FUMBLE         int,
   POINTS               int,
   primary key (ID)
);

