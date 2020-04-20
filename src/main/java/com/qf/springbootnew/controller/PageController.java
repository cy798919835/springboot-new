package com.qf.springbootnew.controller;

import com.qf.springbootnew.service.TmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "page")
public class PageController {
    @Autowired
    private TmUserService tmUserService;
    @RequestMapping(value = "hello")
    public String page(Model model){
        model.addAttribute("username","java1907");
        model.addAttribute("age",15);
        model.addAttribute("userlist",tmUserService.findUserList());
        int a = 1/0;
        return "hello";
    }
}
