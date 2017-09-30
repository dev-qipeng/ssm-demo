/*
Navicat MySQL Data Transfer

Source Server         : testmall
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : sqar

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2017-09-30 16:32:46
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
INSERT INTO `coin` VALUES ('1', '他1', '他', '100', '100', '100', '好', '898989', '你', '好');
INSERT INTO `coin` VALUES ('2', '好', '好', '19', '19', '19', '好', '89898989', '那你', '那你');

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
INSERT INTO `coin_img` VALUES ('3b0bc04eecd64b6cabc499412d66cb7b', '1', 'http://127.0.0.1:8080/img/2017/09/30/ba9301bb-4239-4d64-8432-e83927067b68.jpg', null);
INSERT INTO `coin_img` VALUES ('4cb1747c9d204fa38c5c4716cccba03b', '1', 'http://127.0.0.1:8080/img/2017/09/30/03cd4f90-8847-43a1-bd3e-fbb8c696d5bf.png', null);
INSERT INTO `coin_img` VALUES ('6372f14858e24d4e995008c74de7ef9f', '1', 'http://127.0.0.1:8080/img/2017/09/30/0ea645dc-fe91-4c57-bd1f-bd7a016897dd.png', null);
INSERT INTO `coin_img` VALUES ('6e4d314f159e4fe88b3954ceb9b81443', '1', 'http://127.0.0.1:8080/img/2017/09/30/cfd39742-455b-4051-8957-c2117fb0f31a.jpg', null);
INSERT INTO `coin_img` VALUES ('7434ac260057422b99b346a85210f9a5', '1', 'http://127.0.0.1:8080/img/2017/09/30/956cf89d-e79b-461b-9ee2-3de8ce3a476f.png', null);
INSERT INTO `coin_img` VALUES ('b20331af6559477eac9999b43f0749a3', '1', 'http://127.0.0.1:8080/img/2017/09/30/080bcc21-d472-44d2-b85a-eea01632b8b3.png', null);
INSERT INTO `coin_img` VALUES ('b618dd2cca2140e29ec49aeb89cae802', '1', 'http://127.0.0.1:8080/img/2017/09/30/4d75f5ba-626c-41be-97c5-d57bc9061de4.png', null);
INSERT INTO `coin_img` VALUES ('f635d34068d94a72b96549b62b653c32', '1', 'http://127.0.0.1:8080/img/2017/09/30/f0c2b348-ffb3-467b-b08a-8b819a97d3dc.jpg', null);
