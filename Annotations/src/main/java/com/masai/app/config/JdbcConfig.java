package com.masai.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages="com.masai")
@PropertySource("appname.properties")
public class JdbcConfig {

}
