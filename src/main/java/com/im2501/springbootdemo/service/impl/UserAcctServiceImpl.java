package com.im2501.springbootdemo.service.impl;

import com.im2501.springbootdemo.dao.domain.UserAcct;
import com.im2501.springbootdemo.dao.repository.UserAcctRespository;
import com.im2501.springbootdemo.service.IUserAcctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by iota on 2017/11/27.
 */
@Service
public class UserAcctServiceImpl implements IUserAcctService {
    @Autowired
    private UserAcctRespository userAcctRespository;

    public void saveUserAcct(UserAcct userAcct){
        userAcctRespository.save(userAcct);
    }
}
