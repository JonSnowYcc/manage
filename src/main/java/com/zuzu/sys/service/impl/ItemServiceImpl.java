package com.zuzu.sys.service.impl;

import com.zuzu.sys.entity.Item;
import com.zuzu.sys.mapper.ItemMapper;
import com.zuzu.sys.service.IItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lili
 * @since 2023-06-27
 */
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements IItemService {

}
