package com.myCompany.invoise;

import com.myCompany.invoise.controller.InvoiceControllerInterface;
import com.myCompany.invoise.repository.InvoiceRepositoryInterface;
import com.myCompany.invoise.service.InvoiceServiceInterface;

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

        System.out.print("What kind of controller class do you want? :");
        String controller = sc.nextLine();
        System.out.print("What kind of service class do you want? :");
        String service = sc.nextLine();
        System.out.print("What kind of repository class do you want? :");
        String repository = sc.nextLine();

        try {
            invoiceController = (InvoiceControllerInterface) Class.forName(controller).getDeclaredConstructor().newInstance();
            invoiceService = (InvoiceServiceInterface) Class.forName(service).getDeclaredConstructor().newInstance();
            invoiceRepository = (InvoiceRepositoryInterface) Class.forName(repository).getDeclaredConstructor().newInstance();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        invoiceController.setInvoiceServiceInterface(invoiceService);
        invoiceService.setInvoiceRepository(invoiceRepository);
        invoiceController.createInvoice();

    }
}
