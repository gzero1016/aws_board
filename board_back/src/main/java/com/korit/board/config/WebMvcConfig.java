package com.korit.board.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**") // 모든 요청 엔드포인트(경로) 허용
                    .allowedMethods("*") // 모든 요청 메소드 허용
                    .allowedOrigins("*"); // 모든 요청 서버 허용
    }

}
