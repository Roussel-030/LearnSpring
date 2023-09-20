package com.mycompany.invoise.invoiseweb.controller;

import com.myCompany.invoise.core.controller.InvoiceControllerInterface;
import com.myCompany.invoise.core.entity.Invoice;
import com.myCompany.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WebInvoiceController implements InvoiceControllerInterface {

    @Autowired
    private InvoiceServiceInterface invoiceService;

    public void createInvoice() {
        String name = "SpaceX";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);
        invoiceService.createInvoice(invoice);
    }

    @RequestMapping("/invoice-home")
    public @ModelAttribute("invoices") List<Invoice> displayHome() {
        System.out.println("Invocation method display home: Success!");
        List<Invoice> invoices = invoiceService.getInvoiceList();
        return invoices;
    }

    //Getter and setter
    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }
}
