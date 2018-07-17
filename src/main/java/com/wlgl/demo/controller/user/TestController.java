package com.wlgl.demo.controller.user;

import com.wlgl.demo.model.user.TbUser;
import com.wlgl.demo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    public String hello1(Model model) {
        model.addAttribute("name", "Dear1");
        return "hello1";
    }

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public String hello2(Model model) {
        model.addAttribute("name", "Dear2");
        return "hello2";
    }


    @RequestMapping(value = "/ShowAllUser")
    public String ShowAllUser(Model model) {
        model.addAttribute("userlist", userService.getAllUser());
        return "user/userList";
    }


    @RequestMapping(value = "/ShowAllCustomer")
    public String ShowAllCustomer() {
        return "customer/CustomerList";
    }

}
