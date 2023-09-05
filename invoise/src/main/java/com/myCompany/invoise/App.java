package com.myCompany.invoise;

import com.myCompany.invoise.controller.ConsoleInvoiceController;
import com.myCompany.invoise.controller.WebInvoiceController;
import com.myCompany.invoise.controller.ShowerInvoiceController;
import com.myCompany.invoise.repository.MemoryInvoiceRepository;
import com.myCompany.invoise.repository.DatabaseInvoiceRepository;
import com.myCompany.invoise.service.NumberInvoiceService;

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
            ConsoleInvoiceController consoleInvoiceController = new ConsoleInvoiceController();
            NumberInvoiceService numberInvoiceService = new NumberInvoiceService();
            consoleInvoiceController.setInvoiceServiceInterface(numberInvoiceService);
            MemoryInvoiceRepository memoryInvoiceRepository = new MemoryInvoiceRepository();
            numberInvoiceService.setInvoiceRepository(memoryInvoiceRepository);
            consoleInvoiceController.createInvoice();
        }
        else if(configuration == 2) {
            WebInvoiceController webInvoiceController = new WebInvoiceController();
            NumberInvoiceService numberInvoiceService = new NumberInvoiceService();
            webInvoiceController.setInvoiceServiceInterface(numberInvoiceService);
            DatabaseInvoiceRepository databaseInvoiceRepository = new DatabaseInvoiceRepository();
            numberInvoiceService.setInvoiceRepository(databaseInvoiceRepository);
            webInvoiceController.createInvoice();
        }
        else if(configuration == 3) {
            ShowerInvoiceController showerInvoiceController = new ShowerInvoiceController();
            NumberInvoiceService numberInvoiceService = new NumberInvoiceService();
            showerInvoiceController.setInvoiceServiceInterface(numberInvoiceService);
            DatabaseInvoiceRepository databaseInvoiceRepository = new DatabaseInvoiceRepository();
            numberInvoiceService.setInvoiceRepository(databaseInvoiceRepository);
            showerInvoiceController.createInvoice();
        }
        else {
            System.out.println("Please, choose a configuration between 1,2 or 3!");
        }
    }
}
