package com.shop.gulimall.order.dao;

import com.shop.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author lvjl
 * @email lvjl@gmail.com
 * @date 2020-09-10 17:04:43
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
