package com.zuzu;

import com.zuzu.sys.entity.Car;
import com.zuzu.sys.mapper.CarMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ManageApplicationTests {


    @Resource
    private CarMapper carMapper;
    @Test
    void contextLoads() {
        List<Car> cars = carMapper.selectList(null);
        cars.forEach(System.out::println);

    }

}
