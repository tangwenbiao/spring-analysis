package com.spring.analysis.bind;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author: TangFenQi
 * @description:
 * @date：2020/1/17 15:26
 */
@Component
public class TestBind implements EnvironmentAware {

  @Getter
  @Setter
  private Integer age;

  @Getter
  @Setter
  private String name;

  /**
   * Set the {@code Environment} that this component runs in.
   */
  @Override
  public void setEnvironment(Environment environment) {
    Binder.get(environment).bind("test.bind", Bindable.ofInstance(this));
  }
}
