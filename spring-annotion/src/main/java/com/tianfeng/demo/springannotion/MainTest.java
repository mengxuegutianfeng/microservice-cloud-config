package com.tianfeng.demo.springannotion;

import com.tianfeng.demo.springannotion.config.ConfigTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigTest.class);
//        Person person = applicationContext.getBean(Person.class);
//        Object person1 = applicationContext.getBean("person01");
//        System.out.println(person);
//        System.out.println(person1);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String name : beanDefinitionNames){
            System.out.println(name);
        }
    }
}
