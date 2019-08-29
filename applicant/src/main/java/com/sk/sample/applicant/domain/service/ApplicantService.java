package com.sk.sample.applicant.domain.service;

import java.util.List;

import com.sk.sample.applicant.domain.model.Applicant;
import com.sk.sample.applicant.domain.model.Speciality;

public interface ApplicantService {
	Applicant findById(Long id);
	Applicant findByApplicantID(String ApplicantID);
	List<Applicant> findByCategory(Speciality cate);
	Applicant updateApplicant(String applicantID, Applicant applicant);
	void deleteApplicant(String applicantID);
	Applicant register(Applicant applicant);
}
