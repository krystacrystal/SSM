package com.atguigu.test;

import com.atguigu.components.CommonComponent;
import com.atguigu.components.XxxController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
}
