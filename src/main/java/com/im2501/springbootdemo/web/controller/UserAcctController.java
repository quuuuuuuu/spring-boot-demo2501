package com.im2501.springbootdemo.web.controller;

import com.im2501.springbootdemo.dao.domain.UserAcct;
import com.im2501.springbootdemo.service.IUserAcctService;
import com.im2501.springbootdemo.service.impl.UserAcctServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by iota on 2017/11/27.
 */
@RestController
@RequestMapping("/api")
public class UserAcctController {
    @Autowired
    private IUserAcctService userAcctService;

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public void saveUserAcct(){
        UserAcct userAcct = new UserAcct();
        userAcctService.saveUserAcct(userAcct);

    }
}
