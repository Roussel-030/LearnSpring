package com.myCompany.invoise.core.controller.console;

import com.myCompany.invoise.core.controller.InvoiceControllerInterface;
import com.myCompany.invoise.core.entity.customer.Customer;
import com.myCompany.invoise.core.entity.invoice.Invoice;
import com.myCompany.invoise.core.service.InvoiceServiceInterface;

import java.util.Scanner;

//@Controller
public class ConsoleInvoiceController implements InvoiceControllerInterface {
    private InvoiceServiceInterface invoiceServiceInterface;

    public String createInvoice(Invoice invoice) {
        System.out.print( "What is the customer name :" );
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        invoice = new Invoice();
        Customer customer = new Customer(name);
        invoice.setCustomer(customer);
        invoiceServiceInterface.createInvoice(invoice);
        return null;
    }

    //Getter an setter
    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceServiceInterface = invoiceService;
    }
}
