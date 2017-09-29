/*
Navicat MySQL Data Transfer

Source Server         : testmall
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : sqar

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2017-09-29 18:51:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for coin
-- ----------------------------
DROP TABLE IF EXISTS `coin`;
CREATE TABLE `coin` (
  `id` varchar(32) NOT NULL,
  `dynasty` varchar(20) DEFAULT NULL COMMENT '朝代',
  `outline` varchar(20) DEFAULT NULL COMMENT '纲目',
  `width` double(10,0) DEFAULT NULL COMMENT '长度',
  `height` double(10,0) DEFAULT NULL COMMENT '厚度，高度',
  `weight` double(10,0) DEFAULT NULL COMMENT '重量',
  `material` varchar(20) DEFAULT NULL COMMENT '材质',
  `nubmer` varchar(32) DEFAULT NULL,
  `rate` varchar(20) DEFAULT NULL COMMENT '评级',
  `note` varchar(1024) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of coin
-- ----------------------------

-- ----------------------------
-- Table structure for coin_img
-- ----------------------------
DROP TABLE IF EXISTS `coin_img`;
CREATE TABLE `coin_img` (
  `id` varchar(32) NOT NULL,
  `coin_id` varchar(32) DEFAULT NULL,
  `pic_url` varchar(255) DEFAULT NULL,
  `seq` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of coin_img
-- ----------------------------
