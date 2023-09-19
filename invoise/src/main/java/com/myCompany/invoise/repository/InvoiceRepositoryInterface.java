package com.myCompany.invoise.repository;

import com.myCompany.invoise.entity.Invoice;

import java.util.List;

public interface InvoiceRepositoryInterface {
    void create(Invoice invoice);
    List<Invoice> list();
}
