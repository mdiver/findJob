package com.sk.sample.applicant.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sk.sample.applicant.domain.model.Applicant;
import com.sk.sample.applicant.domain.model.Speciality;
import com.sk.sample.applicant.domain.repository.ApplicantRepository;


@Service("applicantLogic")
public class ApplicantLogic implements ApplicantService {
	@Autowired
	private ApplicantRepository applicantRepository;
	
	public ApplicantLogic(ApplicantRepository applicantRepository)
	{
		this.applicantRepository = applicantRepository;
	}

	@Override
	@Transactional(readOnly=true)
	public List<Applicant> findByCategory(Speciality cate) {
		return applicantRepository.findByCategory(cate);
	}


	@Override
	@Transactional(readOnly=true)
	public Applicant findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	@Transactional
	public Applicant updateApplicant(String applicantID, Applicant newapplicant) {
		Applicant oldapplicant = applicantRepository.findByApplicantID(applicantID);
		if(oldapplicant != null)
		{

			oldapplicant.setName(newapplicant.getName());
			oldapplicant.setCategory(newapplicant.getCategory());
			oldapplicant.setInfo(newapplicant.getInfo());
			return applicantRepository.save(oldapplicant);
		}
		return null;
	}
	
	@Override
	@Transactional
	public void deleteApplicant(String applicantID) {
		Applicant oldapplicant = applicantRepository.findByApplicantID(applicantID);
		applicantRepository.delete(oldapplicant);
	}
	
	
	
	@Override
	@Transactional(readOnly=true)
	public Applicant findByApplicantID(String applicantID)
	{
		return applicantRepository.findByApplicantID(applicantID);
	}
	
	@Override
	@Transactional
	public Applicant register(Applicant applicant) {
		return applicantRepository.save(applicant);
	}

	


}
