package com.sk.sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sk.sample.recruit.domain.repository.RecruitRepository;


@SpringBootApplication
public class RecruitApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecruitApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner execSampleCode(RecruitRepository recruitRepository) {	
		return (args) -> {
			
			displayHello(recruitRepository);
//			insertCompanys(recruitRepository);
//			displayCompanys(companyRepository);
//			updateCompanys(companyRepository);
//			displayCompanys(companyRepository);
//			deleteCompanys(companyRepository);
//			displayCompanys(companyRepository);
//			executeExample1(companyRepository);
		};
	}
	
	public void displayHello(RecruitRepository companyRepository) {
		System.out.println("***************************************************************");
		
		System.out.println("********************* HELLO FINDJOB ******************************************");
		
		System.out.println("***************************************************************");
	}
/*	
	public void insertCompanys(RecruitRepository companyRepository) {
		Recruit company1 = new Recruit("skcc", "SK C&C", new Company_info("skcc@sk.com", "010-1111-1111", "경기도 성남시 분당구 정자동"), Company_Category.IT);
		companyRepository.save(company1);
		
		Recruit company2 = new Recruit("skc", "SKC", new Company_info("skc@sk.com", "010-2222-2222", "서울특뼐시 종로구"), Company_Category.Manufacture);
		companyRepository.save(company2);
		
		Recruit company3 = new Recruit("kb", "국민은행", new Company_info("kb@kbbank.com", "010-3333-3333", "몰라몰라"), Company_Category.Finance);
		companyRepository.save(company3);
	}
	
	public void displayCompanys(RecruitRepository companyRepository) {
		
		Iterable<Recruit> companyList = companyRepository.findByCategory(Company_Category.IT);
		System.out.println("***************************************************************");
		for(Recruit company : companyList) {
			System.out.println(company.toString());	
		}
		System.out.println("***************************************************************");
	}
	public void updateCompanys(RecruitRepository companyRepository) {
        Recruit newCompany = new Recruit("kb", "new국민은행", new Company_info("kb@kbbank.com", "010-5555-5555", "AHFFK"), Company_Category.IT);
        
 
        CompanyLogic logic = new CompanyLogic(companyRepository);
        logic.updateCompany("kb", newCompany);
        
	}
	
	public void deleteCompanys(RecruitRepository companyRepository) {
		CompanyLogic logic = new CompanyLogic(companyRepository);
		logic.deleteCompany("skcc");
	}
*/

}
