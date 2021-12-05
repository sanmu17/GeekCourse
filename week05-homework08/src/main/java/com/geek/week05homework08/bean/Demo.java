package com.geek.week05homework08.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 类描述：
 *
 * @ClassName Demo
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/12/5 17:11
 * @Version 1.0
 */
@Data
@ConfigurationProperties(prefix = "demo.stater")
public class Demo {
    private School school;
}
