package com.sk.sample.company.domain.service;

import java.util.List;
import com.sk.sample.company.domain.model.Company;
import com.sk.sample.company.domain.model.Company_Category;

public interface CompanyService {
	Company findById(Long id);
	Company findByCompanyID(String CompanyID);
	List<Company> findByCategory(Company_Category cate);
	Company updateCompany(String companyID, Company company);
	void deleteCompany(String companyID);
	Company register(Company company);
}
