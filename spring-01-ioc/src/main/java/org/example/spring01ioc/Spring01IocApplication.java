package org.example.spring01ioc;

import org.example.spring01ioc.bean.Dog;
import org.example.spring01ioc.bean.Person;
import org.example.spring01ioc.controller.UserController;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Map;


/*
组件的创建实际 是容器启动的过程中创建 也就是在容器创建之前 加载所有单例组件
单实例 即便是重复获取组件对象 拿到的依然是最先创建的
多实例的情况下 容器启动的时候不会创建实例组件对象 在获取的时候才会创建
分层注解默认可以生效得去前提是在主程序的包下
导入的第三方包像倒入容器中
    1. 自己new注册到容器
    2. Import注解 随便标注 标注一次即可 单实例 最好是单独写一个配置类导入第三方包
 区分组件注册和注入 注册指的是注册到容器管理起来 注入就是依赖注入
 primary注解一旦存在 qualify就不可用了

 @Autowire 和 @Resource 的区别？
 前这只有spring支持
 后者有更轻的通用性
 */

//该注解是实现批量扫描 尤其是和程序入口不同的包下的组件 但是这种是多余的 包含组件的包和该主入口在哦那个一个包下
//@ComponentScan(basePackages = "org.example.spring01ioc")

@SpringBootApplication
public class Spring01IocApplication {

    public static void main(String[] args) {

        //获取ioc容器
        ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocApplication.class, args);

        //不加注解controller就会报错 也为找不到组件
        UserController userController = ioc.getBean(UserController.class);
        //查看默认组件
        String[] names = ioc.getBeanDefinitionNames();
        for (String name: names){
            System.out.println(name);
        }

        /*
        组件名字全局唯一
        Bean注册组件的时候 其同样的组件名字 spring指挥在容器中放一个先获取到得到
         */

        //按照名字获取组件
//        Object hangman = ioc.getBean("zs");  //错误的
        Object hangman = ioc.getBean("hangman"); //正确的
        System.out.println(hangman);

        //按照类型获取单个
//        Object hangman1 = ioc.getBean(Person.class); //组件不唯一抛异常
//        System.out.println(hangman1);

        //按照类型获取多个
        Map<String,Dog> type = ioc.getBeansOfType(Dog.class);
        System.out.println(type);



    }




}
