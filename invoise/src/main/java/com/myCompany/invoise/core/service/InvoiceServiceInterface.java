package com.myCompany.invoise.core.service;

import com.myCompany.invoise.core.entity.invoice.Invoice;
import com.myCompany.invoise.core.repository.InvoiceRepositoryInterface;

public interface InvoiceServiceInterface {
    Invoice createInvoice(Invoice invoice);
    Iterable<Invoice> getInvoiceList();
    Invoice getInvoiceByNumber(String number);
    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
