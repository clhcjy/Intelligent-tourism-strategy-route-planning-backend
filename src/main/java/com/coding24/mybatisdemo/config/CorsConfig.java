package com.coding24.mybatisdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8082/") // 允许来自http://localhost的请求
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 允许的HTTP方法
                .allowedHeaders("*"); // 允许的HTTP头部
    }
}
