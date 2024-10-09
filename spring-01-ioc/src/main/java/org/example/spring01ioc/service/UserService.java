package org.example.spring01ioc.service;

import lombok.Data;
import lombok.ToString;
import org.example.spring01ioc.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Data
@ToString
@Service
public class UserService {
    @Bean
    public UserService userService(){
        return new UserService();
    }

    @Qualifier("hangman") //容器中组件有多个 qualify指定
    @Autowired
    Person person;
}
