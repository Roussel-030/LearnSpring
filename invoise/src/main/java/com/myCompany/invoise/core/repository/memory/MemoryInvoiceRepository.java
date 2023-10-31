package com.myCompany.invoise.core.repository.memory;

import com.myCompany.invoise.core.entity.Invoice;
import com.myCompany.invoise.core.repository.InvoiceRepositoryInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Repository
public class MemoryInvoiceRepository implements InvoiceRepositoryInterface {
    private static List<Invoice> listInvoice = new ArrayList<>();

    @Override
    public Invoice save(Invoice invoice) {
        listInvoice.add(invoice);
        System.out.println("Invoice added with number: "+invoice.getNumber()+" for "+invoice.getCustomer().getName());
        return invoice;
    }

    @Override
    public Iterable<Invoice> findAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<Invoice> findAllById(Iterable<String> strings) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteById(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Invoice entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll(Iterable<? extends Invoice> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends Invoice> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Invoice> findById(String number) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean existsById(String s) {
        throw new UnsupportedOperationException();
    }
}
