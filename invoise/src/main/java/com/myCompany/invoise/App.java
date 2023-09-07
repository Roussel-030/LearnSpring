package com.myCompany.invoise;

import com.myCompany.invoise.controller.InvoiceControllerInterface;
import com.myCompany.invoise.service.InvoiceServiceInterface;
import com.myCompany.invoise.service.prefix.PrefixInvoiceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.myCompany.invoise.controller.web"/*,"com.myCompany.invoise.service.prefix"*/,"com.myCompany.invoise.repository.database"})
@PropertySource("classpath:application.properties")
public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        InvoiceControllerInterface invoiceControllerInterface = context.getBean(InvoiceControllerInterface.class);
        invoiceControllerInterface.createInvoice();
    }

    @Bean
    public InvoiceServiceInterface configureInvoiceService() {
        return new PrefixInvoiceService();
    }
}
