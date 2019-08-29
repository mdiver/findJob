package com.sk.sample.company.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sk.sample.company.domain.model.Company;
import com.sk.sample.company.domain.model.Company_Category;
import com.sk.sample.company.domain.repository.CompanyRepository;


@Service("companyLogic")
public class CompanyLogic implements CompanyService {
	@Autowired
	private CompanyRepository companyRepository;
	
	public CompanyLogic(CompanyRepository companyRepository)
	{
		this.companyRepository = companyRepository;
	}

	@Override
	@Transactional(readOnly=true)
	public List<Company> findByCategory(Company_Category cate) {
		return companyRepository.findByCategory(cate);
	}


	@Override
	@Transactional(readOnly=true)
	public Company findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	@Transactional
	public Company updateCompany(String companyID, Company newCompany) {
		Company oldCompany = companyRepository.findByCompanyID(companyID);
		if(oldCompany != null)
		{

//			oldCompany.setName(newCompany.getName());
//			oldCompany.setCategory(newCompany.getCategory());
//			oldCompany.setInfo(newCompany.getInfo());
			return companyRepository.save(oldCompany);
		}
		return null;
	}
	
	@Override
	@Transactional
	public void deleteCompany(String companyID) {
		Company oldCompany = companyRepository.findByCompanyID(companyID);
		companyRepository.delete(oldCompany);
	}
	
	
	
	@Override
	@Transactional(readOnly=true)
	public Company findByCompanyID(String companyID)
	{
		return companyRepository.findByCompanyID(companyID);
	}
	
	@Override
	@Transactional
	public Company register(Company company) {
		return companyRepository.save(company);
	}


}
