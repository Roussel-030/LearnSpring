package com.myCompany.invoise.repository;

import com.myCompany.invoise.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class MemoryInvoiceRepository implements InvoiceRepositoryInterface {
    private static List<Invoice> listInvoice = new ArrayList<>();

    public void create(Invoice invoice) {
        listInvoice.add(invoice);
        System.out.println("Invoice added with number: "+invoice.getNumber()+" for "+invoice.getCustomerName());
    }
}
