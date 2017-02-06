package com.atollgroup.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by aszatyin on 2017-01-06.
 */
@Data
@AllArgsConstructor
public class Product {
    @Id
    private String productName;
    private List<String> availableSizes;
}
