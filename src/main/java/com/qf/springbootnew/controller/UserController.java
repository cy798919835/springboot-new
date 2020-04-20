package com.qf.springbootnew.controller;

import com.qf.springbootnew.config.Resource;
import com.qf.springbootnew.entity.TUser;
import com.qf.springbootnew.entity.User;
import com.qf.springbootnew.service.TmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private Resource resource;
    @Autowired
    private TmUserService tmUserService;
    @RequestMapping("hello")
    public String hello(){
        System.out.println(resource.getUrl());
        return "hello,SpringBoot!"+resource.getUrl();
    }

    @RequestMapping(value = "getById")
    public TUser getById(Integer id){
        System.out.println("id-"+id);
        System.out.println("获取操作");
        TUser user =tmUserService.findUser(id);
        return user;
    }

    @GetMapping("{id}")
    public User getById(@PathVariable("id") Long id){
        System.out.println("id-"+id);
        System.out.println("获取操作");
        return new User(id,"java",new Date());
    }

    @DeleteMapping("{id}")
    public String deleteById(@PathVariable("id") Long id){
        System.out.println("id-"+id);
        System.out.println("删除操作");
        return "ok";
    }
}
