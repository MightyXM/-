CREATE TABLE `menu`  (
  `mid` int AUTO_INCREMENT NOT NULL COMMENT '菜的序号',
  `fname` varchar(255) NULL COMMENT '菜名',
  `price` FLOAT NOT NULL COMMENT '菜价',
  `rest` int NULL COMMENT '库存',
  PRIMARY KEY (`mid`)
);

CREATE TABLE `ordering`  (
  `no` int AUTO_INCREMENT NOT NULL COMMENT '订单序号',
  `tid` int NOT NULL,
	`price` FLOAT,
  PRIMARY KEY (`no`)
);

CREATE TABLE `orderinfo` (
	`index` INT AUTO_INCREMENT NOT NULL,
	`no` INT NOT NULL,
	`mid` int NOT NULL,
	`fname` varchar(255) NULL COMMENT '菜名',
	 PRIMARY KEY (`index`)
);

CREATE TABLE `table`  (
  `tid` int NOT NULL COMMENT '桌序号',
  `used` tinyint NULL COMMENT '桌子是否被用',
  `reserved` tinyint NULL COMMENT '桌子是否被预定',
  PRIMARY KEY (`tid`)
);

CREATE TABLE `user`  (
  `uid` int NOT NULL COMMENT '主键，用户唯一标识',
  `uname` varchar(255) NULL COMMENT '名称',
  `password` varchar(255) NULL COMMENT '密码',
  `type` tinyint NULL COMMENT '1是超级管理员',
  PRIMARY KEY (`uid`)
);

ALTER TABLE `ordering` ADD CONSTRAINT `fk_ordering_menu_1` FOREIGN KEY (`mid`) REFERENCES `menu` (`mid`);
ALTER TABLE `ordering` ADD CONSTRAINT `fk_ordering_table_1` FOREIGN KEY (`tid`) REFERENCES `table` (`tid`);
ALTER TABLE `orderinfo` ADD CONSTRAINT `fk_orderinfo_ordering_1` FOREIGN KEY (`no`) REFERENCES `ordering` (`no`);

-- 初始化餐桌信息
INSERT into `table` VALUES (1,0,0);
INSERT INTO `table` VALUES (2,0,0);
INSERT into `table` VALUES (3,0,0);

-- 初始化菜单
INSERT into `menu` VALUES (1,'番茄炒蛋',15.5,50);
INSERT into `menu` VALUES (2,'紫菜蛋花',10.5,100);
INSERT into `menu` VALUES (3,'青椒炒肉',23,100);
INSERT into `menu` VALUES (4,'剁椒鱼头',32.5,100);
INSERT into `menu` VALUES (5,'鸡肉豆腐',30,100);

-- 初始化用户
INSERT into `user` VALUES (1,'xm','x',1);
INSERT into `user` VALUES (2,'a','a',0);

-- 初始化订单表
INSERT into `ordering` VALUES (0,0,0);
INSERT into `orderinfo` VALUES (2,12,1,"fname");


