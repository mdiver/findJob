package com.sk.sample.applicant.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.sample.applicant.domain.model.Applicant;
import com.sk.sample.applicant.domain.model.Speciality;
import com.sk.sample.applicant.domain.service.ApplicantService;

@RestController
@RequestMapping("/v1/applicants")
public class ApplicantRestController implements ApplicantService {
	@Autowired
	private ApplicantService applicantService;

	@Override
	@GetMapping("category/{category}")
	public List<Applicant> findByCategory(@PathVariable("category") Speciality category) {
		return applicantService.findByCategory(category);
	}
	
	@Override
	@GetMapping("/{applicantID}")
	public Applicant findByApplicantID(@PathVariable("applicantID") String applicantID) {
		return applicantService.findByApplicantID(applicantID);
	}

	@Override
	@PostMapping
	public Applicant register(@RequestBody Applicant applicant) {
		return applicantService.register(applicant);
	}

	@Override
	@PutMapping("/{applicantID}")
	public Applicant updateApplicant(@PathVariable("applicantID") String applicantID, @RequestBody Applicant applicant) {
		return applicantService.updateApplicant(applicantID, applicant);
	}

	@Override
	@DeleteMapping("/{applicantID}")
	public void deleteApplicant(@PathVariable("applicantID")  String applicantID) {
		applicantService.deleteApplicant(applicantID);
	}
	

	@Override
	public Applicant findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}





}
