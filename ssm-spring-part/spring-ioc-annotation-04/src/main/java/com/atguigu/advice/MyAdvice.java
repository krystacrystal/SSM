package com.atguigu.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;

@Aspect
@Component
public class MyAdvice {

    //指定切面，切面表达式
    @Before(value = "execution(* com.atguigu..impl.*.*(..))")
    public void before(JoinPoint joinPoint) {//传入形参JointPoint，获取目标信息
        //获取目标类的信息
        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
        //获取目标方法修饰符
        int modifiers = joinPoint.getSignature().getModifiers();
        String s = Modifier.toString(modifiers);
        //获取目标方法名称
        String name = joinPoint.getSignature().getName();
        //获取方法参数列表
        Object[] args = joinPoint.getArgs();
    }

    @AfterReturning(value = "execution(* com.atguigu..impl.*.*(..))", returning = "result")
    public void afterReturning(Object result) {

    }

    @AfterThrowing(value = "execution(* com.atguigu..impl.*.*(..))", throwing = "throwable")
    public void afterThrowing(Throwable throwable) {

    }

    @After(value = "execution(* com.atguigu..impl.*.*(..))")
    public void after() {

    }

    @Around(value = "execution(* com.atguigu..impl.*.*(..))")
    public void around() {

    }
}
