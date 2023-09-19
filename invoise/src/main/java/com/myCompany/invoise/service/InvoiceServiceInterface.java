package com.myCompany.invoise.service;

import com.myCompany.invoise.entity.Invoice;
import com.myCompany.invoise.repository.InvoiceRepositoryInterface;

import java.util.List;

public interface InvoiceServiceInterface {
    void createInvoice(Invoice invoice);
    List<Invoice> getInvoiceList();
    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
