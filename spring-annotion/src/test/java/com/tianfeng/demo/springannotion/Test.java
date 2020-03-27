package com.tianfeng.demo.springannotion;

import com.tianfeng.demo.springannotion.bean.Person;
import com.tianfeng.demo.springannotion.config.ConfigTest;
import com.tianfeng.demo.springannotion.config.MainConfigOfLifeCycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Test {

    @SuppressWarnings("resource")
    @org.junit.Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigTest.class);
        Object person = applicationContext.getBean("person");
        Object person1 = applicationContext.getBean("person");

        System.out.println(person == person1);
    }


    @org.junit.Test
    public void test02(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigTest.class);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);
    }

    @org.junit.Test
    public void test03(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigTest.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String name : beanDefinitionNames){
            System.out.println(name); }
    }

    @org.junit.Test
    public void test04(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        //applicationContext.getBean("car");
        applicationContext.close();
    }

    @org.junit.Test
    public void test05(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        Person person = (Person)applicationContext.getBean("person");
        System.out.println(person);
    }
}
