
drop table if exists `tb_user`;
CREATE TABLE `tb_user` (
  `id` char(8) NOT NULL COMMENT 'id',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `age` int NOT NULL COMMENT '年龄',
  `sex` enum('男','女') NOT NULL DEFAULT '男' COMMENT '性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci comment='user';
insert into tb_user(id, name, age, sex) VALUES ('w213sad', 'hello-mybatis', 11, '女');