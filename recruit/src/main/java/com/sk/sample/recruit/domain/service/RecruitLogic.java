package com.sk.sample.recruit.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sk.sample.recruit.domain.model.Recruit;
import com.sk.sample.recruit.domain.repository.RecruitRepository;


@Service("recruitLogic")
public class RecruitLogic implements RecruitService {
	@Autowired
	private RecruitRepository recruitRepository;
	
	public RecruitLogic(RecruitRepository recruitRepository)
	{
		this.recruitRepository = recruitRepository;
	}

	@Override
	@Transactional(readOnly=true)
	public Recruit requestRecruitByApplicantID(String applicantID) {
		// TODO Auto-generated method stub
		return recruitRepository.requestRecruitByApplicantID(applicantID);
	}
	
	@Override
	@Transactional(readOnly=true)
	public void recruitComplete(String applicantID, String companyID) {
		// TODO Auto-generated method stub
		recruitRepository.recruitComplete(applicantID, companyID);
	}

}
