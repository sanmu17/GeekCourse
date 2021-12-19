package com.example.week07homework09;

import com.example.week07homework09.datasource.DynamicDataSourceConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@MapperScan(basePackages = {"com.example.week07homework09.dao"})
@SpringBootApplication
@Import(DynamicDataSourceConfig.class)
public class Week07Homework09Application {

    public static void main(String[] args) {
        SpringApplication.run(Week07Homework09Application.class, args);
    }

}
