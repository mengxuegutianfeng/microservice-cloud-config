package com.tianfeng.demo.springannotion.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(value = {"com.tianfeng.demo.springannotion.aop"})
public class MainConfigOfAop {
}
