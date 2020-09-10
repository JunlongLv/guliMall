package com.shop.gulimall.member.dao;

import com.shop.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lvjl
 * @email lvjl@gmail.com
 * @date 2020-09-10 16:30:37
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
