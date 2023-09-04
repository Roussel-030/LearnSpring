package com.myCompany.invoise.service;

import com.myCompany.invoise.entity.Invoice;
import com.myCompany.invoise.repository.InvoiceRepositoryInterface;

public class InvoiceService implements InvoiceServiceInterface {
    private static long invoiceNumber = 0L;
    private InvoiceRepositoryInterface invoiceRepository;

    public void createInvoice(Invoice invoice) {
        invoice.setNumber(String.valueOf(++invoiceNumber));
        invoiceRepository.create(invoice);
    }

    //Getter and setter
    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }
}
