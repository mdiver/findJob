package com.sk.sample.recruit.domain.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sk.sample.recruit.domain.model.Recruit;


@RepositoryRestResource
public interface RecruitRepository extends PagingAndSortingRepository<Recruit, Long>,
                                              QueryDslPredicateExecutor<Recruit> {
	Recruit requestRecruitByApplicantID(@Param("applicantID") String applicantID);
	
	void recruitComplete(@Param("applicantID") String applicantID, @Param("companyID") String companyID);
}
 