package com.geek.week05homework08;


import com.geek.week05homework08.bean.Klass;
import com.geek.week05homework08.bean.School;
import com.geek.week05homework08.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

/**
 * 类描述：
 *
 * @ClassName BeanConfig
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/12/5 16:01
 * @Version 1.0
 */
@Configuration
public class BeanConfig {
    @Bean("student2002")
    public Student student(){
        Student student = new Student();
        student.setID(2002);
        student.setName("王五");
        return student;
    }
    @Bean("klass2002")
    public Klass klass2002(){
        Klass klass = new Klass();
        klass.setKlassName("2002一班");
        klass.setStudents(Collections.singletonList(student()));
        return klass;
    }
    @Bean("school2002")
    public School school2002(){
        School school = new School();
        school.setName("2002学校");
        school.setKlass(Collections.singletonList(klass2002()));
        return school;
    }
    @Bean("demo")
    public School school(){
        return school2002();
    }
}
