package com.spring.analysis.beanpost;

import com.spring.analysis.beanfactory.TestBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;


public class TestInstantiationBeanPost implements InstantiationAwareBeanPostProcessor {

    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        return new TestBean();
    }
}
