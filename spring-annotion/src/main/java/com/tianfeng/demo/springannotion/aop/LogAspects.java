package com.tianfeng.demo.springannotion.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspects {

    @Pointcut("execution(public void com.tianfeng.demo.springannotion.aop.MathCalculator.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(""+joinPoint.getSignature().getName() +"除法开始....列表参数是,{"+ Arrays.asList(args)+"}");
    }

    @After("pointCut()")
    public void logEnd(){
        System.out.println("除法结束....列表参数是,{}");
    }


    @AfterReturning(value = "pointCut()",returning = "result")
    public void logReturn(Object result){
        System.out.println("除法正常返回....列表参数是,{}");
    }


    @AfterThrowing(value="pointCut()",throwing = "exception")
    public void logException(Exception exception){
        System.out.println("除法异常....列表参数是,{}");
    }
}
