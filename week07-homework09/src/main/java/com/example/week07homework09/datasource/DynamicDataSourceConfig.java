package com.example.week07homework09.datasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.example.week07homework09.enums.DataSourceChanges;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * 类描述：
 *
 * @ClassName DynamicDataSourceConfig
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/12/19 18:14
 * @Version 1.0
 */
@Configuration
public class DynamicDataSourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.master")
    public DataSource masterDataSource(){
        return DruidDataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties("spring.datasource.slave")
    public DataSource slaveDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

       @Bean
    @Primary
    public DynamicDataSource dataSource(DataSource masterDataSource, DataSource slaveDataSource) {
        Map<Object, Object> targetDataSources = new HashMap<>(5);
        targetDataSources.put(DataSourceChanges.MASTER, masterDataSource);
        targetDataSources.put(DataSourceChanges.SLAVE, slaveDataSource);
        return new DynamicDataSource(masterDataSource, targetDataSources);
    }
}
