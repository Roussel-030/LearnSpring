package com.myCompany.invoise.core.controller;

import com.myCompany.invoise.core.entity.invoice.Invoice;
import com.myCompany.invoise.core.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
    String createInvoice(Invoice invoice);
    public void setInvoiceService(InvoiceServiceInterface invoiceService);
}
