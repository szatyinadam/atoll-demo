package com.atollgroup.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by aszatyin on 2017-02-06.
 */
@Data
@AllArgsConstructor
public class MessageModel{
    private long id;
    private String message;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date sentDate;
}
