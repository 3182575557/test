package com.wlgl.demo.mapper.customer;

import com.wlgl.demo.model.customer.TbCustomerinfo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CustomerMapper {

    @Select("select * from tb_customerinfo")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "customerName",  column = "customer_name"),
            @Result(property = "customerPhone",  column = "customer_phone"),
            @Result(property = "customerAddress",  column = "customer_address"),
            @Result(property = "note",  column = "note"),
            @Result(property = "userid",  column = "userid")
    })
    public List<TbCustomerinfo> getAllCustomerinfo();

}
