package com.myCompany.invoise.service.prefix;

import com.myCompany.invoise.entity.Invoice;
import com.myCompany.invoise.repository.InvoiceRepositoryInterface;
import com.myCompany.invoise.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

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
