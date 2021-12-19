package com.example.week07homework09;

import com.example.week07homework09.entity.Table1;
import com.example.week07homework09.service.Table1Service;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
@RunWith(SpringRunner.class)
class Week07Homework09ApplicationTests {
    @Resource
    private Table1Service table1Service;

    @Test
    void contextLoads() {
//        List<Table1> table1s = table1Service.queryAllByLimit(0,10);
        Table1 table1 = table1Service.queryById(2);
        System.out.println(table1);
//        System.out.println(table1s);
    }

}
