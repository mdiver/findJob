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
    private String recruitId;
	private String companyId;
	private String applicantId;
	
	@Enumerated(EnumType.STRING)
	private RecruitStatus recruitStatus;
	
	
	public Recruit(String recruitId, String companyId, String applicantId, RecruitStatus recruitStatus) {

		this.recruitId = recruitId;
		this.companyId = companyId;
		this.applicantId = applicantId;
		this.recruitStatus = recruitStatus;
	}
}
