package com.shop.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.common.utils.PageUtils;
import com.shop.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author lvjl
 * @email lvjl@gmail.com
 * @date 2020-08-31 16:53:06
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 检索所有商品分类
     * @return
     */
    List<CategoryEntity> listWithTree();

    /**
     * 删除多个商品分类
     * @param asList
     * @return
     */
    Boolean removeMenusByIds(List<Long> asList);
}

