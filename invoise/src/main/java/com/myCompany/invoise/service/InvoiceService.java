package com.myCompany.invoise.service;

import com.myCompany.invoise.entity.Invoice;
import com.myCompany.invoise.repository.InvoiceRepository;

public class InvoiceService {
    private static long invoiceNumber = 0L;
    private InvoiceRepository invoiceRepository = new InvoiceRepository();

    public void createInvoice(Invoice invoice) {
        invoice.setNumber(String.valueOf(++invoiceNumber));
        invoiceRepository.create(invoice);
    }
}
