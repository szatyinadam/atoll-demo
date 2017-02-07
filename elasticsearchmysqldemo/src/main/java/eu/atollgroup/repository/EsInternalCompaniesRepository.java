package eu.atollgroup.repository;

import eu.atollgroup.model.SearchableEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by adam on 2016.10.21..
 */
public interface EsInternalCompaniesRepository extends ElasticsearchRepository<SearchableEntity, Integer> {
    SearchableEntity findById(Integer id);
}
