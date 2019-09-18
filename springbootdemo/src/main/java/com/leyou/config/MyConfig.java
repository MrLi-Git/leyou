package com.leyou.config;

import com.leyou.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
// 通过实现WebMvcConfigurer并添加@Configuration注解来实现自定义部分SpringMvc配置
@Configuration
public class MyConfig implements WebMvcConfigurer {
//    重写以下方法，添加自定义拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        通过registry来注册拦截器
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/user/**").excludePathPatterns("/user/hello1");
    }
}
