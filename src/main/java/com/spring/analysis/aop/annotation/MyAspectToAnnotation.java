package com.spring.analysis.aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspectToAnnotation {

  @Pointcut("execution(* com.spring.analysis.service.*.*(..))")
  public void pointCut() {

  }

  @Before("pointCut()")
  public void doBefore() {
    System.out.println("do before in annotation!");
  }

  @After("pointCut()")
  public void doAfter() {
    System.out.println("do after in annotation!");
  }

  @Around("pointCut()")
  public void doAround() {
    System.out.println("do around in annotation!");
  }

}
