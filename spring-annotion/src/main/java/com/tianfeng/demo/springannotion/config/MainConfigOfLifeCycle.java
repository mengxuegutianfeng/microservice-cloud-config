package com.tianfeng.demo.springannotion.config;

import com.tianfeng.demo.springannotion.bean.Car;
import com.tianfeng.demo.springannotion.bean.Person;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.tianfeng.demo.springannotion.bean")
@PropertySource(value={"classpath:/person"})
public class MainConfigOfLifeCycle {

    @Bean(initMethod = "init" , destroyMethod = "destory")
   // @Scope("prototype")
    public Car car(){
        return new Car();
    }

    @Bean
    public Person person(){
        return new Person();
    }
}
