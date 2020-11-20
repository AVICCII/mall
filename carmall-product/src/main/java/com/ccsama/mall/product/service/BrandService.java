package com.ccsama.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ccsama.common.utils.PageUtils;
import com.ccsama.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author cc
 * @email null
 * @date 2020-11-20 16:40:37
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

