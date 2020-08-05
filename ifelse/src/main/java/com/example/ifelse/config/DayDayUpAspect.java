package com.example.ifelse.config;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class DayDayUpAspect {


    @Pointcut("@annotation(com.example.ifelse.config.DayDayUp)")
    public void dayDayUp(){

    }

    @Around("dayDayUp()")
    public Object process(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("切面类 进来!");
        Object object = null;
        try{
            object = pjp.proceed();
        }catch(Exception e){
            System.out.println("到了切面的异常这里来!");
        }
        return object;
    }
}
