package com.im2501.springbootdemo.dao.domain;

import javax.persistence.*;

/**
 * Created by iota on 2017/11/27.
 */
@Entity
@Table(name = "USER_ACCT")
public class UserAcct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
