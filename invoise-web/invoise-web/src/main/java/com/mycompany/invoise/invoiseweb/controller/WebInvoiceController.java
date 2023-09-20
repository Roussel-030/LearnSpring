package com.mycompany.invoise.invoiseweb.controller;

import com.myCompany.invoise.core.controller.InvoiceControllerInterface;
import com.myCompany.invoise.core.entity.Invoice;
import com.myCompany.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/invoice")
public class WebInvoiceController implements InvoiceControllerInterface {

    @Autowired
    private InvoiceServiceInterface invoiceService;

    public void createInvoice() {
        String name = "SpaceX";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);
        invoiceService.createInvoice(invoice);
    }

    @RequestMapping("/home")
    public ModelAndView displayHome() {
        System.out.println("Invocation method display home: Success!");
        ModelAndView mv = new ModelAndView("invoice-home");
        mv.addObject("invoices",invoiceService.getInvoiceList());
        return mv;
    }

    @RequestMapping("/{id}")
    public ModelAndView displayInvoice(@PathVariable("id") String number) {
        System.out.println("Invocation method display invoice: Success!");
        ModelAndView mv = new ModelAndView("invoice-details");
        mv.addObject("invoice",invoiceService.getInvoiceByNumber(number));
        return mv;
    }

    //Getter and setter
    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }
}
