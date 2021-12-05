package com.geek.week05.mapper;

import com.geek.week05.bean.Student;
import org.springframework.stereotype.Repository;

/**
 * 类描述：
 *
 * @ClassName beanMapper
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/12/5 16:33
 * @Version 1.0
 */
@Repository
public class BeanMapper {

    public Student getStudent(){
        Student student = new Student();
        student.setName("annotation-student1");
        student.setID(2003);
        return student;
    }
}
