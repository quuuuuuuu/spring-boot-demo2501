package com.im2501.springbootdemo.dao.repository;

import com.im2501.springbootdemo.dao.domain.UserAcct;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by iota on 2017/11/27.
 */
public interface UserAcctRespository extends JpaRepository<UserAcct,Integer> {

}
