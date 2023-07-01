package com.zuzu.sys.service.impl;

import com.zuzu.sys.entity.Car;
import com.zuzu.sys.mapper.CarMapper;
import com.zuzu.sys.service.ICarService;
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
public class CarServiceImpl extends ServiceImpl<CarMapper, Car> implements ICarService {

}
