package com.atguigu.test;

import com.atguigu.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    @Test
    public void test1() {
        //获取容器实例
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-01.xml");

        //获取组件
        StudentController studentController = applicationContext.getBean(StudentController.class);
        //使用组件
        studentController.findAll();
        //容器的关闭
        applicationContext.close();

    }
}
