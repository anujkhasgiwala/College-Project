/*
SQLyog - Free MySQL GUI v5.17
Host - 5.5.11 : Database - diary
*********************************************************************
Server version : 5.5.11
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `diary`;

USE `diary`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `profile` */

DROP TABLE IF EXISTS `profile`;

CREATE TABLE `profile` (
  `name` varchar(50) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `add` varchar(100) NOT NULL,
  `city` varchar(20) NOT NULL,
  `stat` varchar(50) NOT NULL,
  `country` varchar(50) NOT NULL,
  `mobile` int(10) NOT NULL,
  `sex` char(6) NOT NULL,
  `at` varchar(50) NOT NULL,
  `hobbies` varchar(100) NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `profile` */

LOCK TABLES `profile` WRITE;

insert into `profile` (`name`,`dob`,`add`,`city`,`stat`,`country`,`mobile`,`sex`,`at`,`hobbies`) values ('sdsd','','kjh','hj','kj','kj',232,'m','s','dsd');

UNLOCK TABLES;

/*Table structure for table `register` */

DROP TABLE IF EXISTS `register`;

CREATE TABLE `register` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) CHARACTER SET latin1 COLLATE latin1_german1_ci NOT NULL,
  `password` varchar(16) NOT NULL,
  `email` varchar(100) NOT NULL,
  `sque` varchar(400) NOT NULL,
  `answer` varchar(100) NOT NULL,
  PRIMARY KEY (`id`,`username`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;

/*Data for the table `register` */

LOCK TABLES `register` WRITE;

insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (13,'Afnan','1111','afnanpathan@gmail.com','What is your phone number?','9424590358');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (14,'Aditi','managerhr','onlyaditi@gmail.com','What is your phone number?','9999996633');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (15,'Shivam','141414','shivam@gmail.com','What is your phone number?','9876543210');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (16,'Mark','facebook','mark@facebook.com','What is your pets name?','facebook');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (17,'harshit','ab','coolplayer_harshit@yahoo.com','Who is your favorite teacher?','12345');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (18,'harshitsanghvi','a','coolplayer_harshit@yahoo.com','What is your phone number?','12345');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (19,'harshitsanghvi','a','coolplayer_harshit@yahoo.com','What is your phone number?','12345');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (20,'harshitsanghvi','as','coolplayer_harshit@yahoo.com','What is your phone number?','12345');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (21,'Anuj','captain','anuj@gmail.com','What is your phone number?','11111');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (22,'Anuj','1234567890','anuj@gmail.com','What is your phone number?','hhhhhh');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (23,'Anuj','anuj123','mail2anuj2006@gmail.com','What is your phone number?','123456');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (24,'chinmay','chinmay','chinmay.apte@gmai.com','Who is your favorite teacher?','sd');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (25,'s','chinmay','chinmay.apte@gmai.com','What is your phone number?','h');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (26,'sd','chinmay','chinmay.apte@gmai.com','What is your phone number?','sd');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (27,'sd','chinmay','chinmay.apte@gmai.com','What is your phone number?','sd');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (28,'harshit','h','hhh','hhh','hhh');

UNLOCK TABLES;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
