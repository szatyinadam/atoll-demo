package com.atollgroup.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by aszatyin on 2017-01-06.
 */
@Data
@AllArgsConstructor
public class Address {
    private String city;
    private int zipCode;
    private String street;
}
