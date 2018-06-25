Create Database If Not Exists ssm Character Set UTF8;
Use ssm;
Create Table If Not Exists `book`(
  `book_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '图书ID',
  `bookName` varchar(100) NOT NULL COMMENT '图书名称',
  `bookPrice` int(11) NOT NULL COMMENT '图书价格',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='图书表';

-- 初始化图书数据
INSERT INTO `book` (`book_id`, `bookName`, `bookPrice`)
VALUES
    (1000, 'Java程序设计', 10),
    (1001, '数据结构', 20),
    (1002, '设计模式', 30),
    (1003, '编译原理', 40);