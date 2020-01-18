package com.spring.analysis;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.spring.analysis.beanfactory.TestBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @author: TangFenQi
 * @description:
 * @date：2020/1/17 15:19
 */
@SpringBootApplication
public class AnalysisApplication {

    public static void main(String[] args) throws IntrospectionException {
        SpringApplication springApplication = new SpringApplication(AnalysisApplication.class);
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("test.bind.age", 1);
        dataMap.put("test.bind.name", "abc");
        springApplication.setDefaultProperties(dataMap);
        SpringApplication.run(AnalysisApplication.class);
        BeanInfo beanInfo = Introspector.getBeanInfo(TestBean.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
    }
}
