package com.sk.sample.company.application.proxy.feign.dto.applicant;

import lombok.Data;

@Data
public class ApplicantInfo {
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
