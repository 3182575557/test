package com.wlgl.demo.service.customer;

import com.wlgl.demo.mapper.customer.CustomerMapper;
import com.wlgl.demo.model.customer.TbCustomerinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerMapper {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<TbCustomerinfo> getAllCustomerinfo() {
        return customerMapper.getAllCustomerinfo();
    }
}
