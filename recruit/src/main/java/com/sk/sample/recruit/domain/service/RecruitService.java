package com.sk.sample.recruit.domain.service;

import com.sk.sample.recruit.domain.model.Recruit;

public interface RecruitService {
	Recruit findByApplicantID(String id);

}
