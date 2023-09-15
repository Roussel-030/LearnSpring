package com.myCompany.invoise.controller.web;

import com.myCompany.invoise.controller.InvoiceControllerInterface;
import com.myCompany.invoise.entity.Invoice;
import com.myCompany.invoise.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String displayHome() {
        System.out.println("Invocation method display home: Success!");
        return "index";
    }

    //Getter and setter
    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }
}
