package com.example.week07homework09.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * 类描述：
 *
 * @ClassName MybatisConfig
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/12/19 19:59
 * @Version 1.0
 */

@Configuration
@EnableTransactionManagement
class MyBatisConfig {


    @Value("${mybatis.mapper-locations}")
    private String mapperLocation;


    /**
     * 注入自己重写的数据源
     */
    @Resource(type = DynamicDataSource.class)
    private DataSource dynamicDataSource;


    /**
     * 配置SqlSessionFactory
     * @return SqlSessionFactory
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dynamicDataSource);

        //ResourcePatternResolver(资源查找器)定义了getResources来查找资源
        //PathMatchingResourcePatternResolver提供了以classpath开头的通配符方式查询,否则会调用ResourceLoader的getResource方法来查找
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(mapperLocation));

        return sqlSessionFactoryBean.getObject();
    }


    /**
     * 事务管理器
     * 不写则事务不生效
     */
    @Bean
    public PlatformTransactionManager platformTransactionManager() {
        return new DataSourceTransactionManager(dynamicDataSource);
    }

}
