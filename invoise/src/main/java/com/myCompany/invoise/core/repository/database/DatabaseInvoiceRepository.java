package com.myCompany.invoise.core.repository.database;

/*
import com.myCompany.invoise.core.entity.Invoice;
import com.myCompany.invoise.core.repository.InvoiceRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DatabaseInvoiceRepository implements InvoiceRepositoryInterface {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Invoice create(Invoice invoice) {
        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(con -> {
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO invoice(customer_name, order_number) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,invoice.getCustomerName());
            preparedStatement.setString(2,invoice.getOrderNumber());
            return preparedStatement;
        },keyHolder);

        invoice.setNumber(keyHolder.getKey().toString());

        return invoice;
    }

    @Override
    public List<Invoice> list() {
       return jdbcTemplate.query("SELECT invoice_number, customer_name FROM invoice",
               (rs,rowNum) -> new Invoice(String.valueOf(rs.getLong("invoice_number")),rs.getString("customer_name")));
    }

    @Override
    public Invoice getById(String number) {
       return jdbcTemplate.queryForObject("SELECT invoice_number, customer_name, order_number FROM invoice WHERE invoice_number=?",
               new Object[]{number},
               (rs, rowNum) -> new Invoice(String.valueOf(rs.getLong("invoice_number")),rs.getString("customer_name"),rs.getString("order_number")));
    }
}

*/