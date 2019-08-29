package com.sk.sample.company.domain.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sk.sample.company.domain.model.Company;
import com.sk.sample.company.domain.model.Company_Category;
import com.sk.sample.company.domain.model.Company_info;
import com.sk.sample.company.domain.repository.CompanyRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyRepositoryTest {
	@Autowired
	CompanyRepository companyRepository;
	
	@Test
	public void findByCompanyIDTest(){
		
		Company testCompany = new Company("skc", "SKC", new Company_info("skc@sk.com", "010-2222-2222", "서울특뼐시 종로구"), Company_Category.Manufacture);
		Company ResultCompany = companyRepository.findByCompanyID("skc");
						
		assertEquals(testCompany.getCompanyID(), ResultCompany.getCompanyID());
	}
}
