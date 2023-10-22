package com.myCompany.invoise.core.repository;

import com.myCompany.invoise.core.entity.Invoice;

import java.util.List;

public interface InvoiceRepositoryInterface {
    Invoice create(Invoice invoice);
    List<Invoice> list();
    Invoice getById(String number);
}
