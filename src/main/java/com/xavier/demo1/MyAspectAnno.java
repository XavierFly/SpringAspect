package com.xavier.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面类
 */
@Aspect
public class MyAspectAnno {
    @Before(value = "myPointcut1()")
    public void before(JoinPoint joinPoint) {
        System.out.println("before " + joinPoint);
    }

    @AfterReturning(value = "myPointcut2()", returning = "result")
    public void afterReturning(Object result) {
        System.out.println("afterReturning " + result);
    }

    @Around(value = "myPointcut3()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before around");
        Object object = joinPoint.proceed();
        System.out.println("after around");
        return object;
    }

    @AfterThrowing(value = "myPointcut4()", throwing = "e")
    public void afterThrowing(Throwable e) {
        System.out.println("afterThrowing " + e.getMessage());
    }

    @After(value = "myPointcut5()")
    public void after() {
        System.out.println("after");
    }

    @Pointcut(value = "execution(* com.xavier.demo1.ProductDao.save(..))")
    private void myPointcut1() {}

    @Pointcut(value = "execution(* com.xavier.demo1.ProductDao.update(..))")
    private void myPointcut2() {}

    @Pointcut(value = "execution(* com.xavier.demo1.ProductDao.delete(..))")
    private void myPointcut3() {}

    @Pointcut(value = "execution(* com.xavier.demo1.ProductDao.findOne(..))")
    private void myPointcut4() {}

    @Pointcut(value = "execution(* com.xavier.demo1.ProductDao.findAll(..))")
    private void myPointcut5() {}
}
