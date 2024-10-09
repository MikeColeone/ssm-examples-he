package org.example.spring01ioc;

import org.example.spring01ioc.bean.Dog;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.DocumentDefaultsDefinition;
import org.springframework.stereotype.Component;

@Component
public class demoFactory implements FactoryBean<Dog> {

    //创造对象
    @Override
    public Dog getObject() throws Exception {

        System.out.println("正在创建");
        return new Dog();
    }



    //创造的类型
    @Override
    public Class<Dog> getObjectType() {
        return Dog.class;
    }


    //是否是单例的
    @Override
    public boolean isSingleton() {
//        return FactoryBean.super.isSingleton();
        return true;
    }
}
