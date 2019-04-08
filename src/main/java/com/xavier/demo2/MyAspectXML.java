package com.xavier.demo2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;

public class MyAspectXML {
    public void before(JoinPoint joinPoint) {
        System.out.println("before " + joinPoint);
    }

    public void afterReturning(Object result) {
        System.out.println("afterReturning " + result);
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before around");
        Object object = joinPoint.proceed();
        System.out.println("after around");
        return object;
    }

    public void afterThrowing(Throwable e) {
        System.out.println("afterThrowing " + e.getMessage());
    }

    public void after() {
        System.out.println("after");
    }
}
