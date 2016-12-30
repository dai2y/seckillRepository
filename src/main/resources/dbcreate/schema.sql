-- 数据库初始化脚本

-- 创建数据库
CREATE  DATABASE seckill;

-- 创建秒杀库存表
CREATE TABLE `seckill` (
  `seckill_id`  bigint NOT NULL AUTO_INCREMENT COMMENT '商品库存id' ,
  `name`  varchar(120) NOT NULL COMMENT '商品名称' ,
  `number`  int NOT NULL COMMENT '库存数量' ,
  `start_time`  timestamp NOT NULL COMMENT '秒杀开启时间' ,
  `end_time`  timestamp NOT NULL COMMENT '秒杀结束时间' ,
  `create_time`  timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  PRIMARY KEY (`seckill_id`),
  INDEX `idx_start_time` (`start_time`) ,
  INDEX `idx_end_time` (`end_time`) ,
  INDEX `idx_create_time` (`create_time`)
)ENGINE =InnoDB AUTO_INCREMENT=1000 DEFAULT CHARACTER SET =utf8 COMMENT ='秒杀库存表';

-- 初始化数据
INSERT  INTO
  seckill.secKill(name, number, start_time, end_time)
VALUES
  ('100元秒杀iphone7',100,'2017-01-10 00:00:00','2017-01-16 00:00:00'),
  ('500元秒杀Ipad4',500,'2017-01-10 00:00:00','2017-01-16 00:00:00'),
  ('300元秒杀华为p9',200,'2017-01-10 00:00:00','2017-01-16 00:00:00'),
  ('600元秒杀荣耀9',300,'2017-01-10 00:00:00','2017-01-16 00:00:00');

-- 秒杀成功明细表
CREATE  table `success_killed`(
  `seckill_id`BIGINT NOT NULL  COMMENT '秒杀商品Id',
  `user_phone` BIGINT NOT NULL  COMMENT '用户手机号',
  `state` TINYINT NOT NULL  DEFAULT  -1 COMMENT  '状态标识：-1：无效 0：成功 1：已付款',
  `create_time` TIMESTAMP NOT NULL  COMMENT '创建时间',
  PRIMARY KEY (seckill_id,user_phone),
  KEY idx_create_time(create_time)
)ENGINE = innoDB DEFAULT CHARACTER SET =utf8 COMMENT ='秒杀成功明细表';

