package com.sk.sample.recruit.domain.service;

import com.sk.sample.recruit.domain.model.Recruit;

public interface RecruitService {
	Recruit requestRecruitByApplicantID(String id);
	
	void recruitComplete(String applicantId, String companyId);
}
