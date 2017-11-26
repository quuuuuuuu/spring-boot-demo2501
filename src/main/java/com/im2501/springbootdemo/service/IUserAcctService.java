package com.im2501.springbootdemo.service;

import com.im2501.springbootdemo.dao.domain.UserAcct;
import org.springframework.stereotype.Service;

/**
 * Created by iota on 2017/11/27.
 */
public interface IUserAcctService {
    void saveUserAcct(UserAcct userAcct);
}
