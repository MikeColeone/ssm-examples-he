package org.example.spring01ioc;

import org.example.spring01ioc.bean.Dog;
import org.example.spring01ioc.bean.Person;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring01IocApplication {

    public static void main(String[] args) {

        //获取ioc容器
        ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocApplication.class, args);

        //查看默认组件
        String[] names = ioc.getBeanDefinitionNames();
        for (String name: names){
            System.out.println(name);
        }
//       给容器诸如自己组件

        //从容器获取组件
        Object hdx = ioc.getBean("hdk");

        //按照类型获取
        ioc.getBean(Person.class);

        //按照名字加类型

        //获取多对象
        ioc.getBeansOfType(Person.class);


    }
    @Bean("hdk")  //修改组件名
//    方法名就是组件名字
    //组件名字全局为1 组件名重复 容器中只会放置一个 从上到下获取的第一个组件 或者
    public Person person(){
        Person person1 = new Person();
        person1.setName("张三");
        return person1;
    }

    @Bean
    public Dog dog(){

    }
}
