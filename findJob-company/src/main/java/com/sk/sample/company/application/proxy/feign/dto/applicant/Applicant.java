package com.sk.sample.company.application.proxy.feign.dto.applicant;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Applicant {
	private String applicantID;
	private String name;
	
	private ApplicantInfo info;
	
	@Enumerated(EnumType.STRING)
	private Speciality category;
	
	
	public Applicant(String applicantID, String name, ApplicantInfo info, Speciality category) {

		this.applicantID = applicantID;
		this.name = name;
		this.info = info;
		this.category = category;
	}
}

