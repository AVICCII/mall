package com.ccsama.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ccsama.common.utils.PageUtils;
import com.ccsama.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author cc
 * @email null
 * @date 2020-11-20 16:40:36
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

