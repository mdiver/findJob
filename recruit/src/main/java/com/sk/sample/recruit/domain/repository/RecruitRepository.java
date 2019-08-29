package com.sk.sample.recruit.domain.repository;

import java.util.List;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sk.sample.recruit.domain.model.Recruit;
import com.sk.sample.recruit.domain.model.RecruitStatus;


@RepositoryRestResource
public interface RecruitRepository extends PagingAndSortingRepository<Recruit, Long>,
                                              QueryDslPredicateExecutor<Recruit> {
	
	List<Recruit> findByApplicantId(@Param("applicantId") String applicantId);
	List<Recruit> findByCompanyId(@Param("companyId") String companyId);
}
 