package com.myCompany.invoise;

import com.myCompany.invoise.controller.InvoiceControllerInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.myCompany.invoise.controller.web","com.myCompany.invoise.service.prefix","com.myCompany.invoise.repository.database"})
@PropertySource("classpath:application.properties")
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        InvoiceControllerInterface invoiceControllerInterface = context.getBean(InvoiceControllerInterface.class);
        invoiceControllerInterface.createInvoice();
    }
}
