package com.ccsama.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ccsama.common.utils.PageUtils;
import com.ccsama.mall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author cc
 * @email null
 * @date 2020-11-20 16:40:37
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

