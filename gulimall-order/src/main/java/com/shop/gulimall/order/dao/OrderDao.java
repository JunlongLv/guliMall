package com.shop.gulimall.order.dao;

import com.shop.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lvjl
 * @email lvjl@gmail.com
 * @date 2020-09-10 17:04:43
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
