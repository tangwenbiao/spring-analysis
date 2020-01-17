package com.spring.analysis;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: TangFenQi
 * @description:
 * @date：2020/1/17 15:19
 */
@SpringBootApplication
public class AnalysisApplication {

  public static void main(String[] args) {
    SpringApplication springApplication = new SpringApplication(AnalysisApplication.class);
    Map<String, Object> dataMap = new HashMap<>();
    dataMap.put("test.bind.age", 1);
    dataMap.put("test.bind.name", "abc");
    springApplication.setDefaultProperties(dataMap);
    SpringApplication.run(AnalysisApplication.class);
  }
}
