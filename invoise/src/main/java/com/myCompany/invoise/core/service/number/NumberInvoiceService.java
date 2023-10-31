package com.myCompany.invoise.core.service.number;

import com.myCompany.invoise.core.entity.Invoice;
import com.myCompany.invoise.core.repository.InvoiceRepositoryInterface;
import com.myCompany.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumberInvoiceService implements InvoiceServiceInterface {

    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;

    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    //Getter and setter
    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public Iterable<Invoice> getInvoiceList() {
        Iterable<Invoice> invoices = invoiceRepository.findAll();
        //initialize customer in entity Invoice
        invoices.forEach(invoice -> invoice.getCustomer().getName());
        return invoices;
    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
        return invoiceRepository.findById(number).orElseThrow();
    }
}
