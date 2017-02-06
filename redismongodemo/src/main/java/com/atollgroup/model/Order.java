package com.atollgroup.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

/**
 * Created by aszatyin on 2017-01-06.
 */
@Data
@AllArgsConstructor
public class Order {
    @DBRef
    private List<Product> products;
    private Address address;
    private int price;
}
