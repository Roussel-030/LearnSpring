package com.myCompany.invoise.controller;

import com.myCompany.invoise.entity.Invoice;
import com.myCompany.invoise.service.InvoiceServiceInterface;

public class InvoiceControllerMichel implements InvoiceControllerInterface {
    private InvoiceServiceInterface invoiceServiceInterface;

    public void createInvoice() {
        String name = "Space x";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);
        invoiceServiceInterface.createInvoice(invoice);
    }
}
