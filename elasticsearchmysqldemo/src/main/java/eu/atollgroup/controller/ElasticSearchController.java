package eu.atollgroup.controller;

import eu.atollgroup.model.SearchableEntity;
import eu.atollgroup.service.CompaniesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by adam on 2016.11.09..
 */
@RestController
@RequestMapping("es")
public class ElasticSearchController {
    @Autowired
    private CompaniesService companiesService;

    @GetMapping("/{id}")
    public SearchableEntity getCompanyByIdFromES(@PathVariable Integer id) {
        return companiesService.findESCompanyById(id);
    }

    @GetMapping("/fullsearch/{search}")
    public Iterable<SearchableEntity> getCompanyBySearchFromES(@PathVariable String search) {
        return companiesService.findESCompany(search);
    }
}
