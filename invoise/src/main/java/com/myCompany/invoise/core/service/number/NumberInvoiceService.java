package com.myCompany.invoise.core.service.number;

import com.myCompany.invoise.core.entity.invoice.Invoice;
import com.myCompany.invoise.core.repository.CustomerRepositoryInterface;
import com.myCompany.invoise.core.repository.InvoiceRepositoryInterface;
import com.myCompany.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumberInvoiceService implements InvoiceServiceInterface {

    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;

    @Autowired
    private CustomerRepositoryInterface customerRepository;

    public Invoice createInvoice(Invoice invoice) {
        customerRepository.save(invoice.getCustomer());
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
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
        return invoiceRepository.findById(number).orElseThrow();
    }
}
