package com.sk.sample.company.application.proxy.feign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.feign.FeignClientProperties.FeignClientConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sk.sample.company.application.proxy.feign.dto.applicant.Applicant;

@Service
public class ApplicantProxy {
	@Autowired
	private ApplicantClient applicantClient;
	
	public ApplicantProxy(ApplicantClient applicantClient)
	{
		this.applicantClient = applicantClient;
	}
	
	public Applicant findApplicant(String id) {
		return applicantClient.findApplicant(id);
	}

	public List<Applicant> findAllApplicants() {
		return applicantClient.findAllApplicants();
	}
	
	@FeignClient(name="applicants", url="http://findjob-applicant.cloudzcp.io", configuration=FeignClientConfiguration.class)
	interface ApplicantClient {
		@GetMapping("/v1/applicants/{applicantID}")
		Applicant findApplicant(@RequestParam(value="applicantID", required=true) String applicantID);
		
		@GetMapping("applicants")
		List<Applicant> findAllApplicants();
		
	}
}

