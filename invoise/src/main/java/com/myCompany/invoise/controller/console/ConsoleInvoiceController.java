package com.myCompany.invoise.controller.console;

import com.myCompany.invoise.controller.InvoiceControllerInterface;
import com.myCompany.invoise.entity.Invoice;
import com.myCompany.invoise.service.InvoiceServiceInterface;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class ConsoleInvoiceController implements InvoiceControllerInterface {
    private InvoiceServiceInterface invoiceServiceInterface;

    public void createInvoice() {
        System.out.print( "What is the customer name :" );
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);
        invoiceServiceInterface.createInvoice(invoice);
    }

    //Getter an setter
    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceServiceInterface = invoiceService;
    }
}
