package com.spring.analysis.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.GenericApplicationListener;
import org.springframework.core.ResolvableType;

/**
 * @author: TangFenQi
 * @description:
 * @date：2020/1/17 17:57
 */
public class ListenerToFile implements GenericApplicationListener {

  /**
   * Determine whether this listener actually supports the given event type.
   *
   * @param eventType the event type (never {@code null})
   */
  @Override
  public boolean supportsEventType(ResolvableType eventType) {
    return true;
  }

  /**
   * Handle an application event.
   *
   * @param event the event to respond to
   */
  @Override
  public void onApplicationEvent(ApplicationEvent event) {
    System.out.println("class:" + event.getClass().getName() + "listener to file! ");
  }
}
