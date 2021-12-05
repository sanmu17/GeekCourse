package com.geek.week05homework08.bean;

import lombok.Data;


import java.util.List;

/**
 * 类描述：
 *
 * @ClassName Klass
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/12/5 15:50
 * @Version 1.0
 */
@Data
public class Klass {

    private String klassName;

    private List<Student> students;
}
