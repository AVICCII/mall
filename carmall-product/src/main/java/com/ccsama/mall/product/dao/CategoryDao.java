package com.ccsama.mall.product.dao;

import com.ccsama.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author cc
 * @email null
 * @date 2020-11-20 16:40:37
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
