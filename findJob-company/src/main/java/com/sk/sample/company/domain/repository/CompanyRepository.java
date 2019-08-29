package com.sk.sample.company.domain.repository;

import java.util.List;

import javax.persistence.EnumType;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sk.sample.company.domain.model.Company;
import com.sk.sample.company.domain.model.Company_Category;


@RepositoryRestResource
public interface CompanyRepository extends PagingAndSortingRepository<Company, Long>,
                                              QueryDslPredicateExecutor<Company> {
	
	List<Company> findByCategory(@Param("category") Company_Category category);
	
	//List<Company> findByCategory(@Param("category") Company_Category category);
	
	Company findByCompanyID(@Param("companyID") String companyID);
	
	
	
}
 