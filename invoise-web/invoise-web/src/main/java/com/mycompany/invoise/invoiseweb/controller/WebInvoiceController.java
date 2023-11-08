package com.mycompany.invoise.invoiseweb.controller;

import com.myCompany.invoise.core.entity.customer.Address;
import com.myCompany.invoise.core.entity.customer.Customer;
import com.myCompany.invoise.core.entity.invoice.Invoice;
import com.myCompany.invoise.core.service.InvoiceServiceInterface;
import com.mycompany.invoise.invoiseweb.form.InvoiceForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/invoice")
public class WebInvoiceController{

    @Autowired
    private InvoiceServiceInterface invoiceService;

    @PostMapping("/create")
    public String createInvoice(@Valid @ModelAttribute InvoiceForm invoiceForm, BindingResult results) {
        if(results.hasErrors()) {
            return "invoice-create-form";
        }
        Address address = new Address();
        address.setStreet(invoiceForm.getStreet());
        address.setStreetNumber(invoiceForm.getStreetNumber());
        address.setCity(invoiceForm.getCity());
        address.setZipCode(invoiceForm.getZipCode());
        address.setCountry(invoiceForm.getCountry());

        Customer customer = new Customer();
        customer.setName(invoiceForm.getCustomerName());
        customer.setAddress(address);

        Invoice invoice = new Invoice();
        invoice.setCustomer(customer);
        invoice.setOrderNumber(invoiceForm.getOrderNumber());

        invoiceService.createInvoice(invoice);
        return "invoice-created";
    }

    @GetMapping("/home")
    public String displayHome() {
        System.out.println("Invocation method display home: Success!");
        return "invoice-home";
    }

    /*@GetMapping("/{id}")
    public String displayInvoice(@PathVariable("id") String number, Model model) {
        System.out.println("Invocation method display invoice: Success!");
        model.addAttribute("invoice",invoiceService.getInvoiceByNumber(number));
        return "invoice-details";
    }*/

    @GetMapping("/create-form")
    public String displayInvoiceCreateForm(@ModelAttribute InvoiceForm invoice) {
        return "invoice-create-form";
    }

    //Getter and setter
    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }
}
