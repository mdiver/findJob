package com.sk.sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sk.sample.company.domain.repository.CompanyRepository;


@SpringBootApplication
public class CompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner execSampleCode(CompanyRepository companyRepository) {	
		return (args) -> {
//			insertAccounts(companyRepository);
			displayAccounts(companyRepository);
//			
//			executeExample1(companyRepository);
		};
	}
	
	public void displayAccounts(CompanyRepository companyRepository) {
		System.out.println("***************************************************************");
		
		System.out.println("********************* HELLO FINDJOB ******************************************");
		
		System.out.println("***************************************************************");
	}

}
