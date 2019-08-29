package com.sk.sample.company.domain.model;

import javax.persistence.Embeddable;

import com.sk.sample.company.base.ValueObject;

import lombok.Data;

@Data
@Embeddable
public class Company_info implements ValueObject {
	private String email;
	private String phoneNumber;
	private String address;
	
	public Company_info(String Email, String PhoneNumber, String Address)
	{
		this.email=Email;
		this.phoneNumber = PhoneNumber;
		this.address = Address;
	}
}
