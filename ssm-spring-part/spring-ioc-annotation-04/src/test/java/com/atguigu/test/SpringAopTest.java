package com.atguigu.test;

import com.atguigu.config.JavaConfig;
import com.atguigu.service.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = JavaConfig.class)
public class SpringAopTest {
    @Autowired
    private Calculator calculator;//用接口接值

    @Test
    public void test1() {

        int ans = calculator.add(1, 1);
        System.out.println(ans);

    }
}
