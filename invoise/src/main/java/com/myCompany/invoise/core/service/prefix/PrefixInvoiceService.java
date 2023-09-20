package com.myCompany.invoise.core.service.prefix;

import com.myCompany.invoise.core.entity.Invoice;
import com.myCompany.invoise.core.repository.InvoiceRepositoryInterface;
import com.myCompany.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrefixInvoiceService implements InvoiceServiceInterface {

    @Value("${invoice.number}")
    private long invoiceNumber;
    @Value("${invoice.prefix}")
    private String prefix;

    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;

    public void createInvoice(Invoice invoice) {
        invoice.setNumber(prefix+String.valueOf(++invoiceNumber));
        invoiceRepository.create(invoice);
    }

    //Getter and setter
    public InvoiceRepositoryInterface getInvoiceRepositoryMichel() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepositoryMichel) {
        this.invoiceRepository = invoiceRepositoryMichel;
    }

    @Override
    public List<Invoice> getInvoiceList() {
        return invoiceRepository.list();
    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
        return invoiceRepository.getById(number);
    }

    public long getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
