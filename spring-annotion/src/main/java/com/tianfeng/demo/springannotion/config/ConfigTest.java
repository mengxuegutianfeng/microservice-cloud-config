package com.tianfeng.demo.springannotion.config;


import com.tianfeng.demo.springannotion.bean.Person;
import com.tianfeng.demo.springannotion.condition.ConditionTest;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;


@Configuration
/**
 * @ComponentScans
 * @ComponentScan value  //可重复注解  @Repeatable(ComponentScans.class)
 * @excludeFilter = Filter[]
 * @includeFilter = Filter[]
 * FilterType.ANNOTATION //按照注解
 * FilterType.ASSIGNABLE_TYPE //安装类型
 * FilterType.CUSTOM //自定义规则
 */
@ComponentScan(value="com.tianfeng.demo.springannotion" ,excludeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION,classes = {Controller.class})
})
public class ConfigTest {

    /**
     * @Scope
     * prototype  //用到了才加载
     * singleton //单实例的时候 容器驱动就加载了bean到容器中
     * request
     * session
     * @return
     */
    @Scope("singleton")
    @Bean
    public Person person(){
        return new Person("tianfeng",26);
    }

    /***
     * 懒加载对 singleton而言  用到才加载
     * @return
     */
    @Lazy
    @Bean("person01")
    public Person person01(){
        return new Person("tianfeng",26);
    }

    /**
     * @Conditional 根据一定条件进行加载 实现 condition接口匹配规则  也可以标注在类上
     * @return
     */
    @Conditional({ConditionTest.class})
    @Bean
    public Person person02(){
        return new Person("tianfeng",26);
    }
}
