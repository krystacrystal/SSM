package com.atguigu.ioc_01;

public class ClientService {
    private static ClientService clientService = new ClientService();

    private ClientService() {
    }

    //静态方法中返回实例对象
    public static ClientService createInstance() {
        return clientService;
    }
}
