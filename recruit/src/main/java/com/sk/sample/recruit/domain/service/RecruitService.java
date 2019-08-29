package com.sk.sample.recruit.domain.service;

import java.util.List;

import com.sk.sample.recruit.domain.model.Recruit;

public interface RecruitService {
	Recruit register(Recruit recruit);
	List<Recruit> findByApplicantId(String applicantId);
	List<Recruit> findByCompanyId(String companyId);
	Recruit update(String recruitId, Recruit recruit);
}
