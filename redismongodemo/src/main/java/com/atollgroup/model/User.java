package com.atollgroup.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by aszatyin on 2017-01-06.
 */
@Data
@AllArgsConstructor
public class User {
    private String name;
    private String email;
    private String password;
    private List<Order> orders;
}
