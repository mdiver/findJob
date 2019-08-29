package com.sk.sample.applicant.domain.model;

import javax.persistence.Embeddable;

import com.sk.sample.applicant.base.ValueObject;

import lombok.Data;

@Data
@Embeddable
public class ApplicantInfo implements ValueObject {
	private String email;
	private String phoneNumber;
	private String address;
	private String peroid;
	private Boolean employed;
	
	public ApplicantInfo(String Email, String PhoneNumber, String Address, String Peroid, Boolean Employed)
	{
		this.email=Email;
		this.phoneNumber = PhoneNumber;
		this.address = Address;
		this.peroid = Peroid;
		this.employed = Employed;
	}
}
