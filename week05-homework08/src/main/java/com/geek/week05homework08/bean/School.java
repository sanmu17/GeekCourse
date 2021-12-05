package com.geek.week05homework08.bean;

import lombok.Data;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName School
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/12/5 15:50
 * @Version 1.0
 */
@Data
public class School {
    private String name;
    private List<Klass> klass;
}
