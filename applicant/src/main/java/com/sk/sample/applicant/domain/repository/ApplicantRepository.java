package com.sk.sample.applicant.domain.repository;

import java.util.List;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sk.sample.applicant.domain.model.Applicant;
import com.sk.sample.applicant.domain.model.Speciality;


@RepositoryRestResource
public interface ApplicantRepository extends PagingAndSortingRepository<Applicant, Long>,
                                              QueryDslPredicateExecutor<Applicant> {
	
	List<Applicant> findByCategory(@Param("category") Speciality category);
	
	//List<Applicant> findByCategory(@Param("category") Speciality category);
	
	Applicant findByApplicantID(@Param("applicantID") String applicantID);
	
	
	
}
 