package com.myCompany.invoise.core.controller;

import com.myCompany.invoise.core.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
    void createInvoice();
    public void setInvoiceService(InvoiceServiceInterface invoiceService);
}
