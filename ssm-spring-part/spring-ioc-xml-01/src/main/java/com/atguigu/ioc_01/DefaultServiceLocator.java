package com.atguigu.ioc_01;

public class DefaultServiceLocator {

    private static ClientServiceImpl clientService = new ClientServiceImpl();

    //非静态方法中返回实例对象
    public ClientServiceImpl createClientServiceInstance() {
        return clientService;//实例对象
    }
}