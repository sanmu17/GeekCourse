package com.geek.week05.controller;

import com.geek.week05.bean.Student;
import com.geek.week05.service.BeanService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 类描述：
 *
 * @ClassName BeanController
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/12/5 16:45
 * @Version 1.0
 */
@Controller
public class BeanController {

    @Resource
    private BeanService beanService;

    @ResponseBody
    @GetMapping("/student")
    public Student getStudent(){
        return beanService.getStudent();
    }
}
