package com.ohgiraffers.jenkins.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
        /* NodePort에 설정된 30000번 포트에서 오는 요청에 대한 CORS 설정 해제*/
//        .allowedOrigins("http://localhost:30000")

        /* Ingress 설정으로 내부적으로 통신이 수행되므로 CORS 설정이 없어도 통신 가능*/
        .allowedOrigins("")
        .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS");
  }
}
