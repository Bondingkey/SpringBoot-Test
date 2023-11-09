package com.gzc.config;

import com.gzc.interceptor.MyInterCeptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/05  16:36  周日
 * @Project: SpringBootTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@SpringBootConfiguration//声明配置类
public class MySpringMVCConfig implements WebMvcConfigurer {

    //注入你要启动的拦截器使其生效
    @Autowired
    private MyInterCeptor myInterCeptor;

    //重写此方法,添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterCeptor)//将自己创建的拦截器添加进来
                .addPathPatterns("/user/findAll")//设置拦截路径
                .excludePathPatterns("/index.html");//设置不拦截路经
    }
}
