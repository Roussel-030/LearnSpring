package com.myCompany.invoise;

import com.myCompany.invoise.controller.ConsoleInvoiceController;
import com.myCompany.invoise.controller.InvoiceControllerInterface;
import com.myCompany.invoise.controller.WebInvoiceController;
import com.myCompany.invoise.controller.ShowerInvoiceController;
import com.myCompany.invoise.repository.InvoiceRepositoryInterface;
import com.myCompany.invoise.repository.MemoryInvoiceRepository;
import com.myCompany.invoise.repository.DatabaseInvoiceRepository;
import com.myCompany.invoise.service.InvoiceServiceInterface;
import com.myCompany.invoise.service.NumberInvoiceService;
import com.myCompany.invoise.service.PrefixInvoiceService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        InvoiceControllerInterface invoiceController = null;
        InvoiceServiceInterface invoiceService = null;
        InvoiceRepositoryInterface invoiceRepository = null;

        System.out.print("What kind of controller do you want? (console, web, showerHead):");
        String controller = sc.nextLine();
        System.out.print("What kind of service do you want? (number or prefix):");
        String service = sc.nextLine();
        System.out.print("What kind of repository do you want? (memory or database):");
        String repository = sc.nextLine();

        switch (controller) {
            case "console":
                invoiceController = new ConsoleInvoiceController();
                break;
            case "web":
                invoiceController = new WebInvoiceController();
                break;
            default:
                invoiceController = new ShowerInvoiceController();
        }

        switch (service) {
            case "number":
                invoiceService = new NumberInvoiceService();
                break;
            default:
                invoiceService = new PrefixInvoiceService();
        }

        switch (repository) {
            case "memory":
                invoiceRepository = new MemoryInvoiceRepository();
                break;
            default:
                invoiceRepository = new DatabaseInvoiceRepository();
        }
        invoiceController.setInvoiceServiceInterface(invoiceService);
        invoiceService.setInvoiceRepository(invoiceRepository);
        invoiceController.createInvoice();

    }
}
