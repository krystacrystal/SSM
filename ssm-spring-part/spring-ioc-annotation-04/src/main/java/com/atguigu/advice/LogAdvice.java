package com.atguigu.advice;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAdvice {

    @Before(value = "execution(public int com.atguigu.service.impl.CalculatorImpl.add(int,int))")
    public void start() {
        System.out.println("方式开始了");
    }

    @After(value = "execution(public int com.atguigu.service.impl.CalculatorImpl.add(int,int))")
    public void after() {
        System.out.println("方法结束了");
    }

    @AfterThrowing(value = "execution(public int com.atguigu.service.impl.CalculatorImpl.add(int,int))")
    public void error() {
        System.out.println("方法报错了");
    }
}
