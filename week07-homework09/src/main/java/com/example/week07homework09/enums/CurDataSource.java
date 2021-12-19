package com.example.week07homework09.enums;

import java.lang.annotation.*;

/**
 * 类描述：
 *
 * @ClassName CurDataSource
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/12/19 18:24
 * @Version 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CurDataSource {

    String name() default "";
}
