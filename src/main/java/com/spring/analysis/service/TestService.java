package com.spring.analysis.service;

import com.spring.analysis.aware.TestAutowrite;
import com.spring.analysis.aware.TestAware;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author: TangFenQi
 * @description:
 * @date：2020/1/17 16:52
 */
@Service
@DependsOn({"testController"})
public class TestService implements SmartInitializingSingleton, ApplicationContextAware {

  @Autowired
  private EnvironmentAware testAware;

  @Autowired
  private TestAutowrite testAutowrite;

  @Autowired
  private TestController testController;

  private ApplicationContext applicationContext;

  public void test(@Autowired TestController testController) {
    System.out.println();
  }

  public void test1(@Value("${abc.a:1}") Integer value) {
    System.out.println();
  }

  @Override
  public void afterSingletonsInstantiated() {
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    testController.controller();
  }
}
