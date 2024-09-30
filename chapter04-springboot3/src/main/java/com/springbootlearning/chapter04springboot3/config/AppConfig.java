package com.springbootlearning.chapter04springboot3.config;

import com.springbootlearning.chapter04springboot3.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: AppConfig
 * Package: com.springbootlearning.chapter04springboot3.config
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 2024/9/30
 */
@Configuration // 这是一个配置类，用来代替使用xml来配置bean
public class AppConfig {


    @Bean(value = "zhangsan") // 替代以前的Bean标签，组件在容器中的名字默认是方法名，即user，可以直接修改注解的值
    public User user() {
        User user = new User();
        user.setId(1L);
        user.setName("Tom");
        return user;
    }
}
