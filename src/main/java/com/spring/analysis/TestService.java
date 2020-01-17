package com.spring.analysis;

import com.spring.analysis.aware.TestAutowrite;
import com.spring.analysis.aware.TestAware;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.stereotype.Component;

/**
 * @author: TangFenQi
 * @description:
 * @date：2020/1/17 16:52
 */
@Component
public class TestService implements SmartInitializingSingleton {

  @Autowired
  private EnvironmentAware testAware;

  @Autowired
  private TestAutowrite testAutowrite;

  @Override
  public void afterSingletonsInstantiated() {
    System.out.println();
  }
}
