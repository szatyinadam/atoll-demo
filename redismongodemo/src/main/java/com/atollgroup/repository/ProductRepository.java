package com.atollgroup.repository;

import com.atollgroup.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by aszatyin on 2017-01-06.
 */
public interface ProductRepository extends MongoRepository<Product, String>{
}
