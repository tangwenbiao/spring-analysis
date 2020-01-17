package com.spring.analysis.aware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author: TangFenQi
 * @description:
 * @date：2020/1/17 16:51
 */
@Component
public class TestAware implements EnvironmentAware {

  @Autowired
  private Environment environment;

  /**
   * Set the {@code Environment} that this component runs in.
   */
  @Override
  public void setEnvironment(Environment environment) {
    System.out.println(this.environment.equals(environment));
  }
}
