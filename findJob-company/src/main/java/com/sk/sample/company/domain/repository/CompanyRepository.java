package com.sk.sample.company.domain.repository;



import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sk.sample.company.domain.model.Company;


@RepositoryRestResource
public interface CompanyRepository extends PagingAndSortingRepository<Company, Long>,
                                              QueryDslPredicateExecutor<Company> {
	

}
 