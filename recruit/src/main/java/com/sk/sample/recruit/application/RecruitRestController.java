package com.sk.sample.recruit.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@PostMapping
	public Recruit register(@RequestBody Recruit recruit) {
		return recruitService.register(recruit);
	}
	
	@Override
	@GetMapping("/applicantID/{applicantId}")
	public List<Recruit> findByApplicantId(@PathVariable("applicantId") String applicantId) {
		return recruitService.findByApplicantId(applicantId);
	}
	
	@Override
	@GetMapping("/companyID/{companyId}")
	public List<Recruit> findByCompanyId(@PathVariable("companyId") String companyId) {
		return recruitService.findByCompanyId(companyId);
	}
	
	@Override
	@PutMapping("/{recruitId}")
	public Recruit update(@PathVariable("recruitId") String recruitId, @RequestBody Recruit recruit) {
		return recruitService.update(recruitId, recruit);
	}
}
