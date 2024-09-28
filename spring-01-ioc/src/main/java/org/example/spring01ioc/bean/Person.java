package org.example.spring01ioc.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.EnableMBeanExport;

@Setter
@Getter
@Data
public class Person {
    private String name;

}
