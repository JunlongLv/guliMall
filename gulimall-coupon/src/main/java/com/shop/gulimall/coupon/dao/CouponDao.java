package com.shop.gulimall.coupon.dao;

import com.shop.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lvjl
 * @email lvjl@gmail.com
 * @date 2020-09-10 16:11:37
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
