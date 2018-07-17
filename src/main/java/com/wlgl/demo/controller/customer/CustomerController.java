package com.wlgl.demo.controller.customer;

import com.wlgl.demo.model.customer.TbCustomerinfo;
import com.wlgl.demo.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("getAllCustomerInfo")
    public List<TbCustomerinfo> getAllCustomerinfo(){
        return customerService.getAllCustomerinfo();
    }

}
