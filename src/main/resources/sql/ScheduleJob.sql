/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 5.6.49-log : Database - mybatisPlusDemo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatisPlusDemo` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mybatisPlusDemo`;

/*Table structure for table `SchedulerJob` */

DROP TABLE IF EXISTS `SchedulerJob`;

CREATE TABLE `SchedulerJob` (
  `id` varchar(32) COLLATE utf8_unicode_ci NOT NULL COMMENT '定时任务id',
  `name` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '定时任务名称',
  `group_job` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '定时任务所在的组',
  `cron` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '定时任务规则',
  `desc_job` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '定时任务描述',
  `path` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '定时任务触发接口路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='定时任务表';

/*Data for the table `SchedulerJob` */

insert  into `SchedulerJob`(`id`,`name`,`group_job`,`cron`,`desc_job`,`path`) values 
('a823f7054ac640c7a4ed0fef4e994c06','定时任务1','定时任务','* * * * * ? ','开发定时任务1','http://localhost:8080/a/b');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
