package com.example.week08homework02;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
@MapperScan("com.example.week08homework02.dao")
public class Week08Homework02Application {

    public static void main(String[] args) {
        SpringApplication.run(Week08Homework02Application.class, args);
    }

}
