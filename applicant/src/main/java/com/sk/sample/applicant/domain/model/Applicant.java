package com.sk.sample.applicant.domain.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.sk.sample.applicant.base.AbstractEntity;
import com.sk.sample.applicant.base.AggregateRoot;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class Applicant extends AbstractEntity implements AggregateRoot {
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
