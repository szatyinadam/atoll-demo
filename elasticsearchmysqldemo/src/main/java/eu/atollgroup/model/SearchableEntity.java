package eu.atollgroup.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * Created by adam on 2016.10.21..
 */
@Data
@Document(indexName = "companies", type = "company")
public class SearchableEntity {
    @Id
    private Integer id;
    @JsonProperty("main_activity")
    private String mainActivity;
    @JsonProperty("tax_number")
    private String taxNumber;
    @JsonProperty("company_name")
    private String companyName;
    @JsonProperty("company_short_name")
    private String companyShortName;
    private String city;
    private String street;
    private String web;
    private String email;
}
