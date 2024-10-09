package org.example.spring01ioc.config;

import ch.qos.logback.core.CoreConstants;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//导入第三方组件
@Import(CoreConstants.class)
@Configuration

@ComponentScan  //组件批量扫描 参数写类的全标识符
public class AppConfig {
}
