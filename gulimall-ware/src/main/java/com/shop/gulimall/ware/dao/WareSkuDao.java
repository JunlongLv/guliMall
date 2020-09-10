package com.shop.gulimall.ware.dao;

import com.shop.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author lvjl
 * @email lvjl@gmail.com
 * @date 2020-09-10 17:15:04
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
