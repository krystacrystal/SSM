package com.atguigu.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:jdbc.properties")
@ComponentScan("com.atguigu")
@Configuration
public class MyConfiguration {


}
