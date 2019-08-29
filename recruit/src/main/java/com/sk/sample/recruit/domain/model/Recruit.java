package com.sk.sample.recruit.domain.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.sk.sample.recruit.base.AbstractEntity;
import com.sk.sample.recruit.base.AggregateRoot;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class Recruit extends AbstractEntity implements AggregateRoot {
    private String recruitID;
	private String companyID;
	private String applicantID;//
	
	@Enumerated(EnumType.STRING)
	private RecruitStatus recruitStatus;
	
	
	public Recruit(String recruitID, String companyID, String applicantID, RecruitStatus recruitStatus) {

		this.recruitID = recruitID;
		this.companyID = companyID;
		this.applicantID = applicantID;
		this.recruitStatus = recruitStatus;
	}
}
