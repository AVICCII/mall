package com.ccsama.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ccsama.common.utils.PageUtils;
import com.ccsama.mall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author cc
 * @email null
 * @date 2020-11-20 16:40:37
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

