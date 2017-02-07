package eu.atollgroup.controller;

import eu.atollgroup.model.InternalCompaniesEntity;
import eu.atollgroup.service.CompaniesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by adam on 2016.10.17..
 */
@RestController
@RequestMapping("mysql")
public class MySqlController {
    @Autowired
    private CompaniesService companiesService;

    @GetMapping("/{id}")
    public InternalCompaniesEntity getCompanyById(@PathVariable Integer id) {
        return companiesService.findCompanyById(id);
    }

    @GetMapping("/search/{search}")
    public List<InternalCompaniesEntity> getCompaniesByCompanyNameString(@PathVariable String search) {
        return companiesService.findCompaniesByCompanyName(search);
    }

    @GetMapping("/fullsearch/{search}")
    public List<InternalCompaniesEntity> getCompaniesByEveryFieldString(@PathVariable String search){
        return companiesService.findCompaniesByEveryField(search);
    }
}
