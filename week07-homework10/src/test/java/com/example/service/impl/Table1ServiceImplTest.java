package com.example.service.impl;

import com.example.dao.Table1Dao;
import com.example.entity.Table1;
import com.example.week07homework10.Week07Homework10Application;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * 类描述：
 *
 * @ClassName Table1ServiceImplTest
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/12/25 15:10
 * @Version 1.0
 */
@SpringBootTest(classes = Week07Homework10Application.class)
@RunWith(SpringRunner.class)
class Table1ServiceImplTest {

    @Resource
    private Table1Dao table1Dao;

    @Test
    void queryById() {
        table1Dao.queryById(3);
    }

    @Test
    void queryAllByLimit() {
    }

    @Test
    void insert() {
        Table1 table1 = new Table1();
        table1.setName("test sharding sphere");
        table1Dao.insert(table1);
    }

    @Test
    void update() {
    }

    @Test
    void deleteById() {
    }
}