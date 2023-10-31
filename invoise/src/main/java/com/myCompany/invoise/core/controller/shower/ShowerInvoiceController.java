package com.myCompany.invoise.core.controller.shower;

import com.myCompany.invoise.core.controller.InvoiceControllerInterface;
import com.myCompany.invoise.core.entity.Customer;
import com.myCompany.invoise.core.entity.Invoice;
import com.myCompany.invoise.core.service.InvoiceServiceInterface;

//@Controller
public class ShowerInvoiceController implements InvoiceControllerInterface {
    private InvoiceServiceInterface invoiceServiceInterface;

    @Override
    public String createInvoice(Invoice invoice) {
        System.out.println("Using a scanner");
        invoice = new Invoice();
        Customer customer = new Customer("John English");
        invoice.setCustomer(customer);
        invoiceServiceInterface.createInvoice(invoice);
        return null;
    }

    //Getter an setter
    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceServiceInterface = invoiceService;
    }
}
