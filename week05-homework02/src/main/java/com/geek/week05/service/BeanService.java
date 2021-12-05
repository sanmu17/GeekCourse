package com.geek.week05.service;

import com.geek.week05.bean.Student;
import com.geek.week05.mapper.BeanMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 类描述：
 *
 * @ClassName getBean
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/12/5 16:33
 * @Version 1.0
 */
@Service
public class BeanService {

    @Resource
    private BeanMapper beanMapper;

    public Student getStudent(){
        return beanMapper.getStudent();
    }
}
