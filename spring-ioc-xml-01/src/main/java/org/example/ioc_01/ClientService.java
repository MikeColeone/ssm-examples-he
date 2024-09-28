package org.example.ioc_01;

public class ClientService {
    // 存储唯一实例
    private static final ClientService clientService = new ClientService();

    // 私有构造函数，防止外部实例化
    private ClientService() {}

    // 提供访问实例的静态方法
    public static ClientService createInstance() {
        return clientService;
    }
}
