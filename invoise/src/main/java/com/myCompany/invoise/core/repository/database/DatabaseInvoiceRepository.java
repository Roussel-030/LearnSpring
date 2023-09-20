package com.myCompany.invoise.core.repository.database;

import com.myCompany.invoise.core.entity.Invoice;
import com.myCompany.invoise.core.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DatabaseInvoiceRepository implements InvoiceRepositoryInterface {
    private static List<Invoice> listInvoice = new ArrayList<>();

    public void create(Invoice invoice) {
        listInvoice.add(invoice);
        System.out.println("Database added with number: "+invoice.getNumber()+" for "+invoice.getCustomerName());
    }

    @Override
    public List<Invoice> list() {
        Invoice invoice1 = new Invoice();
        invoice1.setNumber("NUM_1");
        invoice1.setCustomerName("John");
        Invoice invoice2 = new Invoice();
        invoice2.setNumber("NUM_2");
        invoice2.setCustomerName("Bean");
        Invoice invoice3 = new Invoice();
        invoice3.setNumber("NUM_3");
        invoice3.setCustomerName("Adolph");
        return List.of(invoice1,invoice2,invoice3);
    }

    @Override
    public Invoice getById(String number) {
        Invoice invoice = new Invoice();
        invoice.setNumber(number);
        invoice.setCustomerName("EDF");
        invoice.setOrderNumber("ON_002");
        return invoice;
    }
}
