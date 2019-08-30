package com.sk.sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.sk.sample.company.domain.model.Company;
import com.sk.sample.company.domain.model.Company_Category;
import com.sk.sample.company.domain.model.Company_info;
import com.sk.sample.company.domain.repository.CompanyRepository;
import com.sk.sample.company.domain.service.CompanyLogic;


@SpringBootApplication
@EnableFeignClients
public class CompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner execSampleCode(CompanyRepository companyRepository) {	
		return (args) -> {
			
			displayHello(companyRepository);
			insertCompanys(companyRepository);
			displayCompanys(companyRepository);
			updateCompanys(companyRepository);
			displayCompanys(companyRepository);
			deleteCompanys(companyRepository);
			displayCompanys(companyRepository);
		};
	}
	
	public void displayHello(CompanyRepository companyRepository) {
		System.out.println("***************************************************************");
		
		System.out.println("********************* HELLO FINDJOB ******************************************");
		
		System.out.println("***************************************************************");
	}
	
	public void insertCompanys(CompanyRepository companyRepository) {
		Company company1 = new Company("skcc", "SK C&C", new Company_info("skcc@sk.com", "010-1111-1111", "경기도 성남시 분당구 정자동"), Company_Category.IT);
		companyRepository.save(company1);
		
		Company company2 = new Company("skc", "SKC", new Company_info("skc@sk.com", "010-2222-2222", "서울특뼐시 종로구"), Company_Category.Manufacture);
		companyRepository.save(company2);
		
		Company company3 = new Company("kb", "국민은행", new Company_info("kb@kbbank.com", "010-3333-3333", "몰라몰라"), Company_Category.Finance);
		companyRepository.save(company3);
	}
	
	public void displayCompanys(CompanyRepository companyRepository) {
		
		Iterable<Company> companyList = companyRepository.findByCategory(Company_Category.IT);
		System.out.println("***************************************************************");
		for(Company company : companyList) {
			System.out.println(company.toString());	
		}
		System.out.println("***************************************************************");
	}
	public void updateCompanys(CompanyRepository companyRepository) {
        Company newCompany = new Company("kb", "new국민은행", new Company_info("kb@kbbank.com", "010-5555-5555", "AHFFK"), Company_Category.IT);
        
 
//        CompanyLogic logic = new CompanyLogic(companyRepository);
//        logic.updateCompany("kb", newCompany);
        
	}
	
	public void deleteCompanys(CompanyRepository companyRepository) {
//		CompanyLogic logic = new CompanyLogic(companyRepository);
//		logic.deleteCompany("skcc");
	}

}
