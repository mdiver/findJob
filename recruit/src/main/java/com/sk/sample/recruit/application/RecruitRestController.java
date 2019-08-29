package com.sk.sample.recruit.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.sample.recruit.domain.model.Recruit;
import com.sk.sample.recruit.domain.service.RecruitService;

@RestController
@RequestMapping("/v1/recruits")
public class RecruitRestController implements RecruitService {
	@Autowired
	private RecruitService recruitService;

	@Override
	@GetMapping("/{applicantID}")
	public Recruit findByApplicantID(@PathVariable("applicantID") String applicantID) {
		return recruitService.findByApplicantID(applicantID);
	}
/*
	@Override
	@PostMapping
	public Recruit register(@RequestBody Recruit company) {
		return companyService.register(company);
	}

	@Override
	@PutMapping("/{companyID}")
	public Recruit updateCompany(@PathVariable("companyID") String companyID, @RequestBody Recruit company) {
		return companyService.updateCompany(companyID, company);
	}

	@Override
	@DeleteMapping("/{companyID}")
	public void deleteCompany(@PathVariable("companyID")  String companyID) {
		companyService.deleteCompany(companyID);
	}
	

	@Override
	public Recruit findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

*/



}
