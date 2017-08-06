/*
SQLyog Ultimate v11.11 (32 bit)
MySQL - 5.5.20-log : Database - newkumardb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`newkumardb` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `newkumardb`;

/*Table structure for table `customer_master` */

DROP TABLE IF EXISTS `customer_master`;

CREATE TABLE `customer_master` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(200) DEFAULT NULL,
  `customer_address` varchar(500) DEFAULT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `customer_master` */

insert  into `customer_master`(`id`,`customer_name`,`customer_address`,`phone_number`) values (1,'jitesh1','ahmedabad','8866827255'),(3,'a','a','1,'),(6,'aedit','a','9'),(7,'aa','','');

/*Table structure for table `product_type` */

DROP TABLE IF EXISTS `product_type`;

CREATE TABLE `product_type` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `value` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `product_type` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
