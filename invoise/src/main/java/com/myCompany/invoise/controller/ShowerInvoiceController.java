package com.myCompany.invoise.controller;

import com.myCompany.invoise.entity.Invoice;
import com.myCompany.invoise.service.InvoiceServiceInterface;

public class ShowerInvoiceController implements InvoiceControllerInterface{
    private InvoiceServiceInterface invoiceServiceInterface;

    @Override
    public void createInvoice() {
        System.out.println("Using a scanner");
        Invoice invoice = new Invoice();
        invoice.setCustomerName("John English");
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
