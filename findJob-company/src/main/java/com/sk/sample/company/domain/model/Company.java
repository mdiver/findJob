package com.sk.sample.company.domain.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.sk.sample.company.base.AbstractEntity;
import com.sk.sample.company.base.AggregateRoot;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class Company extends AbstractEntity implements AggregateRoot {
    private String companyID;
	private String name;
	
	private Company_info info;
	
	@Enumerated(EnumType.STRING)
	private Company_Category category;
	
	
	public Company(String companyID, String name, Company_info info, Company_Category category) {

		this.companyID = companyID;
		this.name = name;
		this.info = info;
		this.category = category;
	}
}
