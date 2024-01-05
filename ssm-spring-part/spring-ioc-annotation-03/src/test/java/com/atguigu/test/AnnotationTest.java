package com.atguigu.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.atguigu.Configuration.MyConfiguration;
import com.atguigu.components.CommonComponent;
import com.atguigu.components.XxxController;
import com.atguigu.controller.SoldierController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class AnnotationTest {

    @Test
    public void test1() {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-01.xml");
        CommonComponent commonComponent = applicationContext.getBean(CommonComponent.class);
        System.out.println(commonComponent);

        XxxController xxxController = applicationContext.getBean(XxxController.class);
        System.out.println(xxxController);
    }

    @Test
    public void test2() {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(MyConfiguration.class);
        SoldierController soldierController =
                applicationContext.getBean(SoldierController.class);
        soldierController.getMessage();
    }

    @Test
    public void test3() {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(MyConfiguration.class);
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
        System.out.println(jdbcTemplate);
    }
}
