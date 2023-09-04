package com.myCompany.invoise.service;

import com.myCompany.invoise.entity.Invoice;
import com.myCompany.invoise.repository.InvoiceRepositoryMichel;

public class InvoiceServiceMichel {
    private static long invoiceNumber = 112L;
    private InvoiceRepositoryMichel invoiceRepositoryMichel = new InvoiceRepositoryMichel();

    public void createInvoice(Invoice invoice) {
        invoice.setNumber("INV_"+String.valueOf(++invoiceNumber));
        invoiceRepositoryMichel.create(invoice);
    }
}
