package com.atollgroup.service;

import com.atollgroup.model.Address;
import com.atollgroup.model.Order;
import com.atollgroup.model.Product;
import com.atollgroup.model.User;
import com.atollgroup.repository.ProductRepository;
import com.atollgroup.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by aszatyin on 2017-01-06.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;

    public void saveUserAndProduct() {
        productRepository.save(Arrays.asList(
                new Product("product1",Arrays.asList("S","M","XL")),
                new Product("product2",Arrays.asList("S","M","L"))
        ));

        User user = new User("Gipsz Jakab","gipsz@jakab.com","password",
                Arrays.asList(
                        new Order(productRepository.findAll(),
                                new Address("Budapest",1041,"Fő u. 32/A"),2400),
                        new Order(productRepository.findAll(),
                                new Address("Budapest",1041,"Baross Gábor u. 10."),8400)
                )
        );
        userRepository.save(user);
    }


    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
