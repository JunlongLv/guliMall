package com.shop.gulimall.product.dao;

import com.shop.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lvjl
 * @email lvjl@gmail.com
 * @date 2020-08-31 16:53:06
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
