package com.myCompany.invoise.core.controller.shower;

import com.myCompany.invoise.core.controller.InvoiceControllerInterface;
import com.myCompany.invoise.core.entity.Invoice;
import com.myCompany.invoise.core.service.InvoiceServiceInterface;

//@Controller
public class ShowerInvoiceController implements InvoiceControllerInterface {
    private InvoiceServiceInterface invoiceServiceInterface;

    @Override
    public void createInvoice() {
        System.out.println("Using a scanner");
        Invoice invoice = new Invoice();
        invoice.setCustomerName("John English");
        invoiceServiceInterface.createInvoice(invoice);
    }

    //Getter an setter
    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceServiceInterface = invoiceService;
    }
}
