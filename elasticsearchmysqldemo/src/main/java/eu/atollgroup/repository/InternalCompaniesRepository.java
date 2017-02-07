package eu.atollgroup.repository;

import eu.atollgroup.model.InternalCompaniesEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by adam on 2016.10.17..
 */
public interface InternalCompaniesRepository extends CrudRepository<InternalCompaniesEntity, Integer> {
    InternalCompaniesEntity findById(Integer id);
    List<InternalCompaniesEntity> findByCompanyShortNameContaining(String search);
    @Query("SELECT c FROM InternalCompaniesEntity c WHERE " +
            "c.mainActivity LIKE %:search% OR " +
            "c.companyShortName LIKE  %:search% OR " +
            "c.taxNumber LIKE %:search% OR " +
            "c.companyName LIKE %:search% OR "+
            "c.city LIKE %:search% OR "+
            "c.street LIKE %:search% OR "+
            "c.web LIKE %:search% OR "+
            "c.email LIKE %:search%"
            )
    List<InternalCompaniesEntity> findByEveryField(@Param("search") String search);
}
