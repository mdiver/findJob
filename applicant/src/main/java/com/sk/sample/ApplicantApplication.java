package com.sk.sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sk.sample.applicant.domain.model.Applicant;
import com.sk.sample.applicant.domain.model.ApplicantInfo;
import com.sk.sample.applicant.domain.model.Speciality;
import com.sk.sample.applicant.domain.repository.ApplicantRepository;
import com.sk.sample.applicant.domain.service.ApplicantLogic;


@SpringBootApplication
public class ApplicantApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicantApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner execSampleCode(ApplicantRepository applicantRepository) {	
		return (args) -> {
			
			displayHello(applicantRepository);
			insertapplicants(applicantRepository);
//			displayapplicants(applicantRepository);
//			updateapplicants(applicantRepository);
//			displayapplicants(applicantRepository);
//			deleteapplicants(applicantRepository);
//			displayapplicants(applicantRepository);
//			executeExample1(applicantRepository);
		};
	}
	
	public void displayHello(ApplicantRepository applicantRepository) {
		System.out.println("***************************************************************");
		
		System.out.println("********************* HELLO FINDJOB ******************************************");
		
		System.out.println("***************************************************************");
	}
	
	public void insertapplicants(ApplicantRepository applicantRepository) {
		Applicant applicant1 = new Applicant("1", "아이유", new ApplicantInfo("iu@gmail.com", "010-1234-5678", "경기도 성남시 분당구 정자동", "3", false), Speciality.IT);
		applicantRepository.save(applicant1);
		
		Applicant applicant2 = new Applicant("2", "공유", new ApplicantInfo("skc@sk.com", "010-2222-2222", "서울특뼐시 종로구", "7", false), Speciality.Manufacture);
		applicantRepository.save(applicant2);
		
		Applicant applicant3 = new Applicant("3", "유희열", new ApplicantInfo("kb@kbbank.com", "010-3333-3333", "몰라몰라", "10", false), Speciality.Finance);
		applicantRepository.save(applicant3);
	}
	
	public void displayapplicants(ApplicantRepository applicantRepository) {
		
		Iterable<Applicant> applicantList = applicantRepository.findByCategory(Speciality.IT);
		System.out.println("***************************************************************");
		for(Applicant applicant : applicantList) {
			System.out.println(applicant.toString());	
		}
		System.out.println("***************************************************************");
	}
	public void updateapplicants(ApplicantRepository applicantRepository) {
        Applicant newapplicant = new Applicant("2", "공유", new ApplicantInfo("kb@kbbank.com", "010-5555-5555", "AHFFK","10", true), Speciality.IT);
        
 
        ApplicantLogic logic = new ApplicantLogic(applicantRepository);
        logic.updateApplicant("2", newapplicant);
        
	}
	
	public void deleteapplicants(ApplicantRepository applicantRepository) {
		ApplicantLogic logic = new ApplicantLogic(applicantRepository);
		logic.deleteApplicant("3");
	}

}
