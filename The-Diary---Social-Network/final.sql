/*
SQLyog - Free MySQL GUI v5.17
Host - 5.0.27-community-nt : Database - diary
*********************************************************************
Server version : 5.0.27-community-nt
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
  `id` int(100) NOT NULL auto_increment,
  `name` varchar(50) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `add` varchar(100) NOT NULL,
  `city` varchar(20) NOT NULL,
  `stat` varchar(50) default NULL,
  `country` varchar(50) NOT NULL,
  `mobile` int(10) NOT NULL,
  `sex` char(6) NOT NULL,
  `at` varchar(50) NOT NULL,
  `hobbies` varchar(100) NOT NULL,
  PRIMARY KEY  (`id`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `profile` */

/*Table structure for table `register` */

DROP TABLE IF EXISTS `register`;

CREATE TABLE `register` (
  `id` int(11) NOT NULL auto_increment,
  `username` varchar(100) character set latin1 collate latin1_german1_ci NOT NULL,
  `password` varchar(16) NOT NULL,
  `email` varchar(100) NOT NULL,
  `sque` varchar(400) NOT NULL,
  `answer` varchar(100) NOT NULL,
  PRIMARY KEY  (`id`,`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `register` */

insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (13,'Afnan','1111','afnanpathan@gmail.com','What is your phone number?','9424590358');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (14,'Aditi','managerhr','onlyaditi@gmail.com','What is your phone number?','9999996633');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (15,'Shivam','141414','shivam@gmail.com','What is your phone number?','9876543210');
insert into `register` (`id`,`username`,`password`,`email`,`sque`,`answer`) values (16,'Mark','facebook','mark@facebook.com','What is your pets name?','facebook');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
