package com.sk.sample.company.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sk.sample.company.domain.model.Company;
import com.sk.sample.company.domain.repository.CompanyRepository;


@Service("companyLogic")
public class CompanyLogic implements CompanyService {
	@Autowired
	private CompanyRepository companyRepository;

	@Override
	@Transactional(readOnly=true)
	public Company findById(Long id) {
		return companyRepository.findOne(id);
	}

}
