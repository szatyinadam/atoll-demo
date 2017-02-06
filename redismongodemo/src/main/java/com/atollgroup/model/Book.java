package com.atollgroup.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.io.Serializable;

/**
 * Created by aszatyin on 2017-01-06.
 */
@Data
public class Book implements Serializable {
    @Id
    private String id;
    @Indexed
    private String title;
    private String author;
    private String description;
}
