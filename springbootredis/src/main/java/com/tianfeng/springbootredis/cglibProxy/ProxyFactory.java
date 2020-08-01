package com.tianfeng.springbootredis.cglibProxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("....之前");
        Object obj = method.invoke(target,objects);
        System.out.println("....之后");
        return obj;
    }

    public Object getProxyInstance(){
        //工具类  类似于JDK的Proxy
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类 代理对象
        return enhancer.create();
    }
}
