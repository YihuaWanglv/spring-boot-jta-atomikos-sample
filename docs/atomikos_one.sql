/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : atomikos_one

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2016-08-16 17:18:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for capital_account
-- ----------------------------
DROP TABLE IF EXISTS `capital_account`;
CREATE TABLE `capital_account` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `BALANCE_AMOUNT` decimal(10,0) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of capital_account
-- ----------------------------
INSERT INTO `capital_account` VALUES ('1', '4960', '1');
INSERT INTO `capital_account` VALUES ('2', '80030', '2');

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', 'test', '30');
INSERT INTO `customer` VALUES ('2', 'test2', '30');
