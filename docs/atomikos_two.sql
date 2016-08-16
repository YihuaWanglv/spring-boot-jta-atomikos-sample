/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : atomikos_two

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2016-08-16 17:18:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('3', '1', '7');
INSERT INTO `orders` VALUES ('4', '1', '7');

-- ----------------------------
-- Table structure for red_packet_account
-- ----------------------------
DROP TABLE IF EXISTS `red_packet_account`;
CREATE TABLE `red_packet_account` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `BALANCE_AMOUNT` decimal(10,0) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of red_packet_account
-- ----------------------------
INSERT INTO `red_packet_account` VALUES ('1', '70020', '1');
INSERT INTO `red_packet_account` VALUES ('2', '4990', '2');
