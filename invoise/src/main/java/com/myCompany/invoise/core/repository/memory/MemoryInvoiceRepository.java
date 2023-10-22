package com.myCompany.invoise.core.repository.memory;

import com.myCompany.invoise.core.entity.Invoice;
import com.myCompany.invoise.core.repository.InvoiceRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class MemoryInvoiceRepository implements InvoiceRepositoryInterface {
    private static List<Invoice> listInvoice = new ArrayList<>();

    public Invoice create(Invoice invoice) {
        listInvoice.add(invoice);
        System.out.println("Invoice added with number: "+invoice.getNumber()+" for "+invoice.getCustomerName());
        return invoice;
    }

    @Override
    public List<Invoice> list() {
        return listInvoice;
    }

    @Override
    public Invoice getById(String number) {
        return null;
    }
}
