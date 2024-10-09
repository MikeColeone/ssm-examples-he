package org.example.spring01ioc.config;

import org.example.spring01ioc.bean.Dog;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration //声明配置类
public class DogConfig {

    @Bean
    @ConditionalOnMissingBean(name = "hhhh") //容器中没有hhhhh创建dog组件
    public Dog dog(){

        return new Dog();
    }
}
