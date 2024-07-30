package com.example.summer.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class CustomWebMvcConfigurer extends WebMvcConfigurationSupport {
   // implements WebMvcConfigurer -
//   preHandle, afterCompletion 이 중간에 한 번 더 나옴
// 자동등록 해드릴게, 안할게 차이
   @Override
   protected void addInterceptors(InterceptorRegistry registry) {
      registry.addInterceptor(new MyInterceptor())
            .addPathPatterns("/**");
   }
}
