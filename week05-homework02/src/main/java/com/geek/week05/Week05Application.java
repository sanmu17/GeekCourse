package com.geek.week05;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week05Application {


    public static void main(String[] args) {

//        ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("beans.xml");
//        System.out.println("XML装配方式：");
//        System.out.println(beans.getBean("school1"));
//
//        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//        System.out.println("Configuration:");
//        System.out.println(context.getBean("school2002", School.class));

        SpringApplication.run(Week05Application.class, args);
    }

}
