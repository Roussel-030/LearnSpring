package com.myCompany.invoise.core.service.number;

import com.myCompany.invoise.core.entity.Invoice;
import com.myCompany.invoise.core.repository.InvoiceRepositoryInterface;
import com.myCompany.invoise.core.service.InvoiceServiceInterface;

import java.util.List;

//@Service
public class NumberInvoiceService implements InvoiceServiceInterface {
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

    @Override
    public List<Invoice> getInvoiceList() {
        return invoiceRepository.list();
    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
        return invoiceRepository.getById(number);
    }
}
