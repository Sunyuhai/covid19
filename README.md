项目所用数据库建表语句：

create database `bigdata`


covid19_1	CREATE TABLE `covid19_1` (
  `datetime` varchar(20) NOT NULL DEFAULT '',
  `currentConfirmedCount` bigint(20) DEFAULT '0',
  `confirmedCount` bigint(20) DEFAULT '0',
  `suspectedCount` bigint(20) DEFAULT '0',
  `curedCount` bigint(20) DEFAULT '0',
  `deadCount` bigint(20) DEFAULT '0',
  PRIMARY KEY (`datetime`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8


t_offset	CREATE TABLE `t_offset` (
  `topic` varchar(255) NOT NULL,
  `partition` int(11) NOT NULL,
  `groupid` varchar(255) NOT NULL,
  `offset` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`topic`,`partition`,`groupid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

le
covid19_2	CREATE TABLE `covid19_2` (
  `datetime` varchar(20) NOT NULL DEFAULT '',
  `locationId` int(11) NOT NULL DEFAULT '0',
  `provinceShortName` varchar(20) DEFAULT '',
  `cityName` varchar(20) DEFAULT '',
  `currentConfirmedCount` int(11) DEFAULT '0',
  `confirmedCount` int(11) DEFAULT '0',
  `suspectedCount` int(11) DEFAULT '0',
  `curedCount` int(11) DEFAULT '0',
  `deadCount` int(11) DEFAULT '0',
  `pid` int(11) DEFAULT '0',
  PRIMARY KEY (`datetime`,`locationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8


covid19_3	CREATE TABLE `covid19_3` (
  `dateId` varchar(20) NOT NULL DEFAULT '',
  `confirmedIncr` bigint(20) DEFAULT '0',
  `confirmedCount` bigint(20) DEFAULT '0',
  `suspectedCount` bigint(20) DEFAULT '0',
  `curedCount` bigint(20) DEFAULT '0',
  `deadCount` bigint(20) DEFAULT '0',
  PRIMARY KEY (`dateId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8


covid19_4	CREATE TABLE `covid19_4` (
  `datetime` varchar(20) NOT NULL DEFAULT '',
  `provinceShortName` varchar(20) NOT NULL DEFAULT '',
  `pid` int(11) DEFAULT '0',
  `confirmedCount` bigint(20) DEFAULT '0',
  PRIMARY KEY (`datetime`,`provinceShortName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8


covid19_5	CREATE TABLE `covid19_5` (
  `datetime` varchar(20) NOT NULL DEFAULT '',
  `locationId` int(11) NOT NULL DEFAULT '0',
  `provinceShortName` varchar(20) DEFAULT '',
  `cityName` varchar(20) DEFAULT '',
  `currentConfirmedCount` int(11) DEFAULT '0',
  `confirmedCount` int(11) DEFAULT '0',
  `suspectedCount` int(11) DEFAULT '0',
  `curedCount` int(11) DEFAULT '0',
  `deadCount` int(11) DEFAULT '0',
  `pid` int(11) DEFAULT '0',
  PRIMARY KEY (`datetime`,`locationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

covid19_wz	CREATE TABLE `covid19_wz` (
  `name` varchar(12) NOT NULL DEFAULT '',
  `cg` int(11) DEFAULT '0',
  `xb` int(11) DEFAULT '0',
  `jz` int(11) DEFAULT '0',
  `xh` int(11) DEFAULT '0',
  `xq` int(11) DEFAULT '0',
  `kc` int(11) DEFAULT '0',
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
