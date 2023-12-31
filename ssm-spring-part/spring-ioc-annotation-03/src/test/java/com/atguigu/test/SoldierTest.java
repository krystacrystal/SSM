package com.atguigu.test;

import com.atguigu.controller.SoldierController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SoldierTest {
    @Test
    public void test1() {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-02.xml");
        SoldierController soldierController = applicationContext.getBean(SoldierController.class);
        soldierController.getMessage();
    }
}
