package com.myCompany.invoise;

import com.myCompany.invoise.controller.InvoiceController;
import com.myCompany.invoise.controller.InvoiceControllerMichel;
import com.myCompany.invoise.repository.InvoiceRepository;
import com.myCompany.invoise.repository.InvoiceRepositoryMichel;
import com.myCompany.invoise.service.InvoiceService;
import com.myCompany.invoise.service.InvoiceServiceMichel;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print("What configuration do you want? (1/2):");
        Scanner sc = new Scanner(System.in);
        int configuration = sc.nextInt();
        if(configuration == 1) {
            InvoiceController invoiceController = new InvoiceController();
            InvoiceService invoiceService = new InvoiceService();
            invoiceController.setInvoiceServiceInterface(invoiceService);
            InvoiceRepository invoiceRepository = new InvoiceRepository();
            invoiceService.setInvoiceRepository(invoiceRepository);
            invoiceController.createInvoice();
        }
        else {
            InvoiceControllerMichel invoiceControllerMichel = new InvoiceControllerMichel();
            InvoiceServiceMichel invoiceServiceMichel = new InvoiceServiceMichel();
            invoiceControllerMichel.setInvoiceServiceInterface(invoiceServiceMichel);
            InvoiceRepositoryMichel invoiceRepositoryMichel = new InvoiceRepositoryMichel();
            invoiceServiceMichel.setInvoiceRepositoryMichel(invoiceRepositoryMichel);
            invoiceControllerMichel.createInvoice();
        }
    }
}
