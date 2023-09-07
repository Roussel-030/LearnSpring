package com.myCompany.invoise;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.myCompany.invoise.controller.web","com.myCompany.invoise.service.prefix","com.myCompany.invoise.repository.database"})
@PropertySource("classpath:application.properties")
public class AppConfig {
}
