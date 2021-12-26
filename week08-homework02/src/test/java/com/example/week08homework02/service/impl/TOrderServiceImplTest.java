package com.example.week08homework02.service.impl;

import com.example.week08homework02.Week08Homework02Application;
import com.example.week08homework02.entity.TOrder;
import com.example.week08homework02.service.TOrderService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 类描述：
 *
 * @ClassName TOrderServiceImplTest
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/12/26 11:06
 * @Version 1.0
 */
@SpringBootTest(classes = Week08Homework02Application.class)
@RunWith(SpringRunner.class)
class TOrderServiceImplTest {
    @Resource
    private TOrderService tOrderService;

    @Test
    void queryById() {
        List<TOrder> tOrder = tOrderService.queryById(1,12);
        for (TOrder order : tOrder) {
            System.out.println(order);
        }
    }


    @Test
    void insert() {
        TOrder torder = new TOrder();
        torder.setUserId(1);
        torder.setDeleted(0);
        torder.setOrderNo(12L);
        tOrderService.insert(torder);
    }


}