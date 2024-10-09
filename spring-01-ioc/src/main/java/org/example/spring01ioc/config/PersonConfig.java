package org.example.spring01ioc.config;

import org.example.spring01ioc.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;


/*
调整组建的作用域
默认是单实例的 prototype session request singleton
 */
@Scope
@Configuration
public class PersonConfig {
    @Bean("hdk")  //修改组件名
//    方法名就是组件名字
    //组件名字全局为1 组件名重复 容器中只会放置一个 从上到下获取的第一个组件 或者
    public Person person(){
        Person person1 = new Person();
        person1.setName("张三");
        return person1;
    }

    /*
    懒加载 用的时候在创建 用于单例模式
     */
    @Lazy
    @Bean("hangman")
    public Person zs(){
        Person person = new Person();
        person.setName("zs");
        return person;
    }
}
