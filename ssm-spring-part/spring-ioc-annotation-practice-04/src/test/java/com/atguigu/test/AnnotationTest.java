package com.atguigu.test;

import com.atguigu.configration.AnnotationConfig;
import com.atguigu.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {

    @Test
    public void test1() {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AnnotationConfig.class);
        StudentController studentController = applicationContext.getBean(StudentController.class);
        studentController.findAll();
    }

}
