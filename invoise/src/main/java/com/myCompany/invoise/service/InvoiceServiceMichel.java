package com.myCompany.invoise.service;

import com.myCompany.invoise.entity.Invoice;
import com.myCompany.invoise.repository.InvoiceRepositoryInterface;

public class InvoiceServiceMichel implements InvoiceServiceInterface {
    private static long invoiceNumber = 112L;
    private InvoiceRepositoryInterface invoiceRepositoryMichel;

    public void createInvoice(Invoice invoice) {
        invoice.setNumber("INV_"+String.valueOf(++invoiceNumber));
        invoiceRepositoryMichel.create(invoice);
    }

    //Getter and setter
    public InvoiceRepositoryInterface getInvoiceRepositoryMichel() {
        return invoiceRepositoryMichel;
    }

    public void setInvoiceRepositoryMichel(InvoiceRepositoryInterface invoiceRepositoryMichel) {
        this.invoiceRepositoryMichel = invoiceRepositoryMichel;
    }
}
