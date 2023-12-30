package com.atguigu.test;

import com.atguigu.ioc_01.ClientService;
import com.atguigu.ioc_01.ClientServiceImpl;
import com.atguigu.ioc_01.HappyComponent;
import com.atguigu.ioc_02.SimpleMovieLister;
import com.atguigu.ioc_02.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
    @Test
    public void test1() {
        //实例化容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring-bean-01.xml");
        //获取组件-根据id值获取
        //HappyComponent happyComponent = (HappyComponent) applicationContext.getBean("happyComponent");
        //根据类型获取组件
        HappyComponent happyComponent = applicationContext.getBean("happyComponent2", HappyComponent.class);
        //使用组价
        happyComponent.doWork();
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring-bean-01.xml");
        ClientService clientService = applicationContext.getBean(ClientService.class);
        System.out.println(clientService);
        ClientServiceImpl clientService1 = applicationContext.getBean(ClientServiceImpl.class);
        System.out.println(clientService1);
    }

    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring-bean-02.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        System.out.println(userService.toString());
    }

    @Test
    public void test4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring-bean-02.xml");
        SimpleMovieLister simpleMovieLister = applicationContext.getBean(SimpleMovieLister.class);
        System.out.println(simpleMovieLister.toString());
    }

    @Test
    public void test5() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring-bean-02.xml");
        SimpleMovieLister bean1 = applicationContext.getBean(SimpleMovieLister.class);
        SimpleMovieLister bean2 = applicationContext.getBean(SimpleMovieLister.class);
        //内容是一样的，地址不一样
        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(bean1 == bean2);
    }
}
