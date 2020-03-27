package com.tianfeng.demo.springannotion.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ConditionTest implements Condition {
    /**
     *  conditionContext.getBeanFactory();
     *         conditionContext.getClassLoader();
     *         conditionContext.getEnvironment();
     *         conditionContext.getRegistry(); //bean定义的注册类
     *  annotatedTypeMetadata 注释信息
     *
     * @param conditionContext
     * @param annotatedTypeMetadata
     * @return
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return false;
    }
}
