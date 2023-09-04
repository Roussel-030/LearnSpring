package com.myCompany.invoise.controller;

import com.myCompany.invoise.entity.Invoice;
import com.myCompany.invoise.service.InvoiceServiceMichel;

public class InvoiceControllerMichel {
    public void createInvoiceUsingWebForm() {
        String name = "Space x";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);
        InvoiceServiceMichel invoiceServiceMichel = new InvoiceServiceMichel();
        invoiceServiceMichel.createInvoice(invoice);
    }
}
