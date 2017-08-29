/*
Navicat MySQL Data Transfer

Source Server         : testmall
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : personalsite

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2017-08-29 10:11:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `project_name` varchar(255) DEFAULT NULL,
  `student_id` int(20) DEFAULT NULL,
  `project_category` varchar(255) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `result` varchar(255) DEFAULT NULL COMMENT '研究成果',
  `funds` varchar(255) DEFAULT NULL COMMENT '经费',
  `team` varchar(255) DEFAULT NULL COMMENT '项目成员',
  `introduction` varchar(255) DEFAULT NULL COMMENT '项目介绍',
  `research_contents` varchar(255) DEFAULT NULL COMMENT '研究内容',
  `plan` varchar(255) DEFAULT NULL COMMENT '实施计划',
  `status` varchar(255) DEFAULT NULL COMMENT '审核状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(22) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `college` varchar(50) DEFAULT NULL COMMENT '院系班级',
  `tutor` varchar(20) DEFAULT NULL COMMENT '指导老师',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '小明', '男', '1232389023', 'qpp@qq.com', '软件学院14级01班', '刘芳梅');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `user_id` int(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_type` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '123', '123', '学生');
