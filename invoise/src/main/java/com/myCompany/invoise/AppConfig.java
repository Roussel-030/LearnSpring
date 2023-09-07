package com.myCompany.invoise;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.myCompany.invoise.controller.web","com.myCompany.invoise.service.prefix","com.myCompany.invoise.repository.database"})
public class AppConfig {
}
