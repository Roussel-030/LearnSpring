package com.myCompany.invoise.core.controller.console;

import com.myCompany.invoise.core.controller.InvoiceControllerInterface;
import com.myCompany.invoise.core.entity.Invoice;
import com.myCompany.invoise.core.service.InvoiceServiceInterface;

import java.util.Scanner;

//@Controller
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
