package eu.atollgroup.service;

import eu.atollgroup.model.InternalCompaniesEntity;
import eu.atollgroup.model.SearchableEntity;
import eu.atollgroup.repository.EsInternalCompaniesRepository;
import eu.atollgroup.repository.InternalCompaniesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static org.elasticsearch.index.query.QueryBuilders.queryStringQuery;

import java.util.List;

/**
 * Created by adam on 2016.10.17..
 */
@Service
public class CompaniesService {
    @Autowired
    private InternalCompaniesRepository companiesRepository;
    @Autowired
    private EsInternalCompaniesRepository esCompaniesRepository;

    public InternalCompaniesEntity findCompanyById(Integer id){
        return companiesRepository.findById(id);
    }

    public List<InternalCompaniesEntity> findCompaniesByCompanyName(String companyName){
        return companiesRepository.findByCompanyShortNameContaining(companyName);
    }

    public List<InternalCompaniesEntity> findCompaniesByEveryField(String search){
        return companiesRepository.findByEveryField(search);
    }

    public SearchableEntity findESCompanyById(Integer id) {
        return esCompaniesRepository.findById(id);
    }

    public Iterable<SearchableEntity> findESCompany(String search){
        return esCompaniesRepository.search(queryStringQuery(search));
    }
}
