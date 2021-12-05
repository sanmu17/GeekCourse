package com.geek.week05homework08;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 类描述：
 *
 * @ClassName DemoAutoConfiguration
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/12/5 17:08
 * @Version 1.0
 */
@Configuration
@EnableConfigurationProperties(BeanConfig.class)
@Import(BeanConfig.class)
public class DemoAutoConfiguration {
}
