package com.myCompany.invoise;

import com.myCompany.invoise.entity.Invoice;
import com.myCompany.invoise.service.InvoiceService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print( "What is the customer name :" );
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);
        InvoiceService invoiceService = new InvoiceService();
        invoiceService.createInvoice(invoice);
    }
}
