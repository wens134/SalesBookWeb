package com.spinel.hr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login").setViewName("login");
    }
    
    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**/*.js").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/**/*.json").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/**/*.woff").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/**/*.woff2").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/**/*.ttf").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/**/*.jpg").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/**/*.css").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/**/*.map").addResourceLocations("classpath:/static/");
    }

}