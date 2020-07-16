package com.nik.up.AOP;


import com.nik.up.Service.Work;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class Logging {

    @Pointcut("execution(* com.nik.up.Service.Work.*(..))")
    private void select(){
    }

    @After("select()")
    public void afterAdvice(){
        System.out.println("After Advice");
    }

    @Around("select()")
    public Object aspectMethod(ProceedingJoinPoint joinPoint) throws Throwable {

        Object ret = joinPoint.proceed();
        Object print = joinPoint.getSignature().getName();
        System.out.println("Name of method: " + print.toString());

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        System.out.println(method.toGenericString());

        return ret;
    }
}
