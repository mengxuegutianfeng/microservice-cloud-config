package com.tianfeng.springbootredis.cglibProxy;

public class Client {
    public static void main(String[] args) {
        RealInternet target = new RealInternet();
        RealInternet proxyInstance = (RealInternet)new ProxyFactory(target).getProxyInstance();
        proxyInstance.connectTo("so.cn");
    }
}
