package com.myCompany.invoise.repository.database;

import com.myCompany.invoise.entity.Invoice;
import com.myCompany.invoise.repository.InvoiceRepositoryInterface;
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
}
