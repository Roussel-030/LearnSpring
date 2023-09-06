package com.myCompany.invoise.controller;

import com.myCompany.invoise.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
    void createInvoice();
    public void setInvoiceService(InvoiceServiceInterface invoiceService);
}
