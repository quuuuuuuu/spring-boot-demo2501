package com.im2501.springbootdemo.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

import javax.persistence.EntityManagerFactory;

/**
 * Created by iota on 2017/11/26.
 */
//@Configuration
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class demo_db_config {
//    @Bean
//    public EntityManagerFactory sessionFactory(EntityManagerFactory emf) {
//        EntityManagerFactory factory = new EntityManagerFactory();
//        factory.setEntityManagerFactory(emf);
//        return factory;
//    }
}
