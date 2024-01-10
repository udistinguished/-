/*
 Navicat Premium Data Transfer

 Source Server         : mysql8.0.20
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : springbooty2180

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 01/03/2023 15:18:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for config
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '配置文件' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of config
-- ----------------------------
INSERT INTO `config` VALUES (1, 'picture1', 'http://localhost:8080/springbooty2180/upload/picture1.jpg');
INSERT INTO `config` VALUES (2, 'picture2', 'http://localhost:8080/springbooty2180/upload/picture2.jpg');
INSERT INTO `config` VALUES (3, 'picture3', 'http://localhost:8080/springbooty2180/upload/picture3.jpg');
INSERT INTO `config` VALUES (6, 'homepage', NULL);

-- ----------------------------
-- Table structure for jiatingshouru
-- ----------------------------
DROP TABLE IF EXISTS `jiatingshouru`;
CREATE TABLE `jiatingshouru`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `yonghuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户姓名',
  `zhanghuhao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账户号',
  `shourufenlei` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收入分类',
  `jine` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '金额',
  `riqi` date NULL DEFAULT NULL COMMENT '日期',
  `beizhu` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 57 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '家庭收入' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of jiatingshouru
-- ----------------------------
INSERT INTO `jiatingshouru` VALUES (51, '2021-04-14 10:48:51', '用户名1', '用户姓名1', '账户号1', '收入分类1', '金额1', '2021-04-14', '备注1');
INSERT INTO `jiatingshouru` VALUES (52, '2021-04-14 10:48:51', '用户名2', '用户姓名2', '账户号2', '收入分类2', '金额2', '2021-04-14', '备注2');
INSERT INTO `jiatingshouru` VALUES (53, '2021-04-14 10:48:51', '用户名3', '用户姓名3', '账户号3', '收入分类3', '金额3', '2021-04-14', '备注3');
INSERT INTO `jiatingshouru` VALUES (54, '2021-04-14 10:48:51', '用户名4', '用户姓名4', '账户号4', '收入分类4', '金额4', '2021-04-14', '备注4');
INSERT INTO `jiatingshouru` VALUES (55, '2021-04-14 10:48:51', '用户名5', '用户姓名5', '账户号5', '收入分类5', '金额5', '2021-04-14', '备注5');
INSERT INTO `jiatingshouru` VALUES (56, '2021-04-14 10:48:51', '用户名6', '用户姓名6', '账户号6', '收入分类6', '金额6', '2021-04-14', '备注6');

-- ----------------------------
-- Table structure for jiatingzhanghu
-- ----------------------------
DROP TABLE IF EXISTS `jiatingzhanghu`;
CREATE TABLE `jiatingzhanghu`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `yonghuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户姓名',
  `zhanghuhao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账户号',
  `jine` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '金额',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '家庭账户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of jiatingzhanghu
-- ----------------------------
INSERT INTO `jiatingzhanghu` VALUES (21, '2023-03-01 10:48:51', '用户名1', '用户姓名1', '账户号1', '金额1');
INSERT INTO `jiatingzhanghu` VALUES (22, '2023-03-01 10:48:51', '用户名2', '用户姓名2', '账户号2', '金额2');
INSERT INTO `jiatingzhanghu` VALUES (23, '2023-03-01 10:48:51', '用户名3', '用户姓名3', '账户号3', '金额3');
INSERT INTO `jiatingzhanghu` VALUES (24, '2023-03-01 10:48:51', '用户名4', '用户姓名4', '账户号4', '金额4');
INSERT INTO `jiatingzhanghu` VALUES (25, '2023-03-01 10:48:51', '用户名5', '用户姓名5', '账户号5', '金额5');
INSERT INTO `jiatingzhanghu` VALUES (26, '2023-03-01 10:48:51', '用户名6', '用户姓名6', '账户号6', '金额6');

-- ----------------------------
-- Table structure for jiatingzhichu
-- ----------------------------
DROP TABLE IF EXISTS `jiatingzhichu`;
CREATE TABLE `jiatingzhichu`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `yonghuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户姓名',
  `zhanghuhao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账户号',
  `zhichufenlei` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支出分类',
  `jine` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '金额',
  `riqi` date NULL DEFAULT NULL COMMENT '日期',
  `beizhu` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 67 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '家庭支出' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of jiatingzhichu
-- ----------------------------
INSERT INTO `jiatingzhichu` VALUES (61, '2023-03-01 10:48:51', '用户名1', '用户姓名1', '账户号1', '支出分类1', '金额1', '2023-03-01', '备注1');
INSERT INTO `jiatingzhichu` VALUES (62, '2023-03-01 10:48:51', '用户名2', '用户姓名2', '账户号2', '支出分类2', '金额2', '2023-03-01', '备注2');
INSERT INTO `jiatingzhichu` VALUES (63, '2023-03-01 10:48:51', '用户名3', '用户姓名3', '账户号3', '支出分类3', '金额3', '2023-03-01', '备注3');
INSERT INTO `jiatingzhichu` VALUES (64, '2023-03-01 10:48:51', '用户名4', '用户姓名4', '账户号4', '支出分类4', '金额4', '2023-03-01', '备注4');
INSERT INTO `jiatingzhichu` VALUES (65, '2023-03-01 10:48:51', '用户名5', '用户姓名5', '账户号5', '支出分类5', '金额5', '2023-03-01', '备注5');
INSERT INTO `jiatingzhichu` VALUES (66, '2023-03-01 10:48:51', '用户名6', '用户姓名6', '账户号6', '支出分类6', '金额6', '2023-03-01', '备注6');

-- ----------------------------
-- Table structure for shourufenlei
-- ----------------------------
DROP TABLE IF EXISTS `shourufenlei`;
CREATE TABLE `shourufenlei`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shourufenlei` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收入分类',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 37 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '收入分类' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shourufenlei
-- ----------------------------
INSERT INTO `shourufenlei` VALUES (31, '2023-03-01 10:48:51', '收入分类1');
INSERT INTO `shourufenlei` VALUES (32, '2023-03-01 10:48:51', '收入分类2');
INSERT INTO `shourufenlei` VALUES (33, '2023-03-01 10:48:51', '收入分类3');
INSERT INTO `shourufenlei` VALUES (34, '2023-03-01 10:48:51', '收入分类4');
INSERT INTO `shourufenlei` VALUES (35, '2023-03-01 10:48:51', '收入分类5');
INSERT INTO `shourufenlei` VALUES (36, '2023-03-01 10:48:51', '收入分类6');

-- ----------------------------
-- Table structure for token
-- ----------------------------
DROP TABLE IF EXISTS `token`;
CREATE TABLE `token`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(0) NOT NULL COMMENT '用户id',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `tablename` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表名',
  `role` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色',
  `token` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'token表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of token
-- ----------------------------
INSERT INTO `token` VALUES (1, 11, '用户1', 'yonghu', '用户', '6pi8yz4lk12l1angwvd026eo1igllvdt', '2023-03-01 10:48:51', '2023-03-01 10:48:51');
INSERT INTO `token` VALUES (2, 1, 'abo', 'users', '管理员', '1xfqmp6gk80muma26tjccfds2xyitfga', '2023-03-01 10:48:51', '2023-03-01 10:48:51');

-- ----------------------------
-- Table structure for touzilicai
-- ----------------------------
DROP TABLE IF EXISTS `touzilicai`;
CREATE TABLE `touzilicai`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `yonghuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户姓名',
  `touzileixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '投资类型',
  `touzizhanghu` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '投资账户',
  `mingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `jine` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '金额',
  `beizhu` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `touzishijian` date NULL DEFAULT NULL COMMENT '投资时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 87 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '投资理财' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of touzilicai
-- ----------------------------
INSERT INTO `touzilicai` VALUES (81, '2021-04-14 10:48:51', '用户名1', '用户姓名1', '股票', '投资账户1', '名称1', '金额1', '备注1', '2021-04-14');
INSERT INTO `touzilicai` VALUES (82, '2021-04-14 10:48:51', '用户名2', '用户姓名2', '股票', '投资账户2', '名称2', '金额2', '备注2', '2021-04-14');
INSERT INTO `touzilicai` VALUES (83, '2021-04-14 10:48:51', '用户名3', '用户姓名3', '股票', '投资账户3', '名称3', '金额3', '备注3', '2021-04-14');
INSERT INTO `touzilicai` VALUES (84, '2021-04-14 10:48:51', '用户名4', '用户姓名4', '股票', '投资账户4', '名称4', '金额4', '备注4', '2021-04-14');
INSERT INTO `touzilicai` VALUES (85, '2021-04-14 10:48:51', '用户名5', '用户姓名5', '股票', '投资账户5', '名称5', '金额5', '备注5', '2021-04-14');
INSERT INTO `touzilicai` VALUES (86, '2021-04-14 10:48:51', '用户名6', '用户姓名6', '股票', '投资账户6', '名称6', '金额6', '备注6', '2021-04-14');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `role` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'abo', 'abo', '管理员', '2023-03-01 10:48:51');

-- ----------------------------
-- Table structure for yinxingchuxu
-- ----------------------------
DROP TABLE IF EXISTS `yinxingchuxu`;
CREATE TABLE `yinxingchuxu`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `yonghuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户姓名',
  `chuxuleixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '储蓄类型',
  `yinxingmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '银行名称',
  `yinxingzhanghu` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '银行账户',
  `jine` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '金额',
  `cunrushijian` date NULL DEFAULT NULL COMMENT '存入时间',
  `beizhu` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 77 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '银行储蓄' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yinxingchuxu
-- ----------------------------
INSERT INTO `yinxingchuxu` VALUES (71, '2021-04-14 10:48:51', '用户名1', '用户姓名1', '活期', '银行名称1', '银行账户1', '金额1', '2021-04-14', '备注1');
INSERT INTO `yinxingchuxu` VALUES (72, '2021-04-14 10:48:51', '用户名2', '用户姓名2', '活期', '银行名称2', '银行账户2', '金额2', '2021-04-14', '备注2');
INSERT INTO `yinxingchuxu` VALUES (73, '2021-04-14 10:48:51', '用户名3', '用户姓名3', '活期', '银行名称3', '银行账户3', '金额3', '2021-04-14', '备注3');
INSERT INTO `yinxingchuxu` VALUES (74, '2021-04-14 10:48:51', '用户名4', '用户姓名4', '活期', '银行名称4', '银行账户4', '金额4', '2021-04-14', '备注4');
INSERT INTO `yinxingchuxu` VALUES (75, '2021-04-14 10:48:51', '用户名5', '用户姓名5', '活期', '银行名称5', '银行账户5', '金额5', '2021-04-14', '备注5');
INSERT INTO `yinxingchuxu` VALUES (76, '2021-04-14 10:48:51', '用户名6', '用户姓名6', '活期', '银行名称6', '银行账户6', '金额6', '2021-04-14', '备注6');

-- ----------------------------
-- Table structure for yonghu
-- ----------------------------
DROP TABLE IF EXISTS `yonghu`;
CREATE TABLE `yonghu`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `mima` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `yonghuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户姓名',
  `touxiang` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `xingbie` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `nianling` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年龄',
  `shoujihaoma` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号码',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `yonghuming`(`yonghuming`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yonghu
-- ----------------------------
INSERT INTO `yonghu` VALUES (11, '2021-04-14 10:48:50', '用户1', '123456', '用户姓名1', 'http://localhost:8080/springbooty2180/upload/yonghu_touxiang1.jpg', '男', '年龄1', '13823888881');
INSERT INTO `yonghu` VALUES (12, '2021-04-14 10:48:50', '用户2', '123456', '用户姓名2', 'http://localhost:8080/springbooty2180/upload/yonghu_touxiang2.jpg', '男', '年龄2', '13823888882');
INSERT INTO `yonghu` VALUES (13, '2021-04-14 10:48:50', '用户3', '123456', '用户姓名3', 'http://localhost:8080/springbooty2180/upload/yonghu_touxiang3.jpg', '男', '年龄3', '13823888883');
INSERT INTO `yonghu` VALUES (14, '2021-04-14 10:48:50', '用户4', '123456', '用户姓名4', 'http://localhost:8080/springbooty2180/upload/yonghu_touxiang4.jpg', '男', '年龄4', '13823888884');
INSERT INTO `yonghu` VALUES (15, '2021-04-14 10:48:50', '用户5', '123456', '用户姓名5', 'http://localhost:8080/springbooty2180/upload/yonghu_touxiang5.jpg', '男', '年龄5', '13823888885');
INSERT INTO `yonghu` VALUES (16, '2021-04-14 10:48:50', '用户6', '123456', '用户姓名6', 'http://localhost:8080/springbooty2180/upload/yonghu_touxiang6.jpg', '男', '年龄6', '13823888886');

-- ----------------------------
-- Table structure for zhichufenlei
-- ----------------------------
DROP TABLE IF EXISTS `zhichufenlei`;
CREATE TABLE `zhichufenlei`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhichufenlei` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支出分类',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 47 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '支出分类' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of zhichufenlei
-- ----------------------------
INSERT INTO `zhichufenlei` VALUES (41, '2021-04-14 10:48:51', '支出分类1');
INSERT INTO `zhichufenlei` VALUES (42, '2021-04-14 10:48:51', '支出分类2');
INSERT INTO `zhichufenlei` VALUES (43, '2021-04-14 10:48:51', '支出分类3');
INSERT INTO `zhichufenlei` VALUES (44, '2021-04-14 10:48:51', '支出分类4');
INSERT INTO `zhichufenlei` VALUES (45, '2021-04-14 10:48:51', '支出分类5');
INSERT INTO `zhichufenlei` VALUES (46, '2021-04-14 10:48:51', '支出分类6');

SET FOREIGN_KEY_CHECKS = 1;
