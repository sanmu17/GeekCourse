

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `order_id` int(20) NOT NULL COMMENT '订单id',
  `product_id` int(20) NOT NULL COMMENT '商品',
  `user_id` int(20) NOT NULL COMMENT '所属客户',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '寄送地址',
  `create_data` timestamp NULL DEFAULT NULL COMMENT '订单时间',
  `deleted` smallint(5) UNSIGNED ZEROFILL NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
