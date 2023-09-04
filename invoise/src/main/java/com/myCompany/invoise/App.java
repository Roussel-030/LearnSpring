package com.myCompany.invoise;

import com.myCompany.invoise.controller.InvoiceController;
import com.myCompany.invoise.controller.InvoiceControllerMichel;

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
            invoiceController.createInvoice();
        }
        else {
            InvoiceControllerMichel invoiceControllerMichel = new InvoiceControllerMichel();
            invoiceControllerMichel.createInvoice();
        }
    }
}
