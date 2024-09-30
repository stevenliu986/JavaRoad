package com.springbootlearning.chapter04springboot3.config;

import com.springbootlearning.chapter04springboot3.bean.Cat;
import com.springbootlearning.chapter04springboot3.bean.Dog;
import com.springbootlearning.chapter04springboot3.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: AppConfig2
 * Package: com.springbootlearning.chapter04springboot3.config
 * Description: 条件组件
 * 1. 如果存在FastsqlException这个类，给容器中放一个Cat组件，名cat01
 * 2. 否则，给容器中放一个Dog组件，名dog01
 * 3. 如果系统中有dog01组件，就给容器中放一个User组件，名zhangsan
 * 4. 否则，就放一个User，名lisi
 *
 * @Author: Steven_LIU
 * @Create: 2024/9/30
 */
@Configuration
public class AppConfig2 {
    @ConditionalOnClass(name = "com.alibaba.druid.FastsqlException")
    @Bean
    Cat cat01() {
        return new Cat();
    }

    @ConditionalOnMissingClass(value = "com.alibaba.druid.FastsqlException")
    @Bean
    Dog dog01() {
        return new Dog();
    }

    @ConditionalOnBean(type = "dog01")
    @Bean
    User zhangsan() {
        return new User();
    }

    @ConditionalOnMissingBean(type = "dog01")
    @Bean
    User lisi() {
        return new User();
    }
}
