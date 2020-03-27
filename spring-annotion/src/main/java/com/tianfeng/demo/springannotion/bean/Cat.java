package com.tianfeng.demo.springannotion.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Cat implements InitializingBean, DisposableBean {

    public Cat() {
        System.out.println("cat......constructor...");
    }

    @Override
    //@PrsDestroy 对象创建并附好值之后
    public void destroy() throws Exception {
        System.out.println("cat......destroy...");
    }

    @Override
    //@PostConstruct 容器移除对象之前
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat......afterPropertiesSet...");

    }
}
