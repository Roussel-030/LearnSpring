package com.myCompany.invoise;

import com.myCompany.invoise.controller.InvoiceController;
import com.myCompany.invoise.controller.InvoiceControllerMichel;
import com.myCompany.invoise.controller.InvoiceControllerShakeAll;
import com.myCompany.invoise.repository.InvoiceRepository;
import com.myCompany.invoise.repository.InvoiceRepositoryMichel;
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
        System.out.print("What configuration do you want? (1,2 or 3):");
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
        else if(configuration == 2) {
            InvoiceControllerMichel invoiceControllerMichel = new InvoiceControllerMichel();
            InvoiceService invoiceService = new InvoiceService();
            invoiceControllerMichel.setInvoiceServiceInterface(invoiceService);
            InvoiceRepositoryMichel invoiceRepositoryMichel = new InvoiceRepositoryMichel();
            invoiceService.setInvoiceRepository(invoiceRepositoryMichel);
            invoiceControllerMichel.createInvoice();
        }
        else if(configuration == 3) {
            InvoiceControllerShakeAll invoiceControllerShakeAll = new InvoiceControllerShakeAll();
            InvoiceService invoiceService = new InvoiceService();
            invoiceControllerShakeAll.setInvoiceServiceInterface(invoiceService);
            InvoiceRepositoryMichel invoiceRepositoryMichel = new InvoiceRepositoryMichel();
            invoiceService.setInvoiceRepository(invoiceRepositoryMichel);
            invoiceControllerShakeAll.createInvoice();
        }
        else {
            System.out.println("Please, choose a configuration between 1,2 or 3!");
        }
    }
}
