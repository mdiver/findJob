package com.sk.sample.company.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sk.sample.company.domain.model.Company;
import com.sk.sample.company.domain.model.Company_Category;
import com.sk.sample.company.domain.service.CompanyService;

@RestController
@RequestMapping("/v1/companys")
public class CompanyRestController implements CompanyService {
	@Autowired
	private CompanyService companyService;

	@Override
	@GetMapping("category/{category}")
	public List<Company> findByCategory(@PathVariable("category") Company_Category category) {
		return companyService.findByCategory(category);
	}
	
	@Override
	@GetMapping("/{companyID}")
	public Company findByCompanyID(@PathVariable("companyID") String companyID) {
		return companyService.findByCompanyID(companyID);
	}

	@Override
	@PostMapping
	public Company register(@RequestBody Company company) {
		return companyService.register(company);
	}

	@Override
	@PutMapping("/{companyID}")
	public Company updateCompany(@PathVariable("companyID") String companyID, @RequestBody Company company) {
		return companyService.updateCompany(companyID, company);
	}

	@Override
	@DeleteMapping("/{companyID}")
	public void deleteCompany(@PathVariable("companyID")  String companyID) {
		companyService.deleteCompany(companyID);
	}
	

	@Override
	public Company findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}





}
