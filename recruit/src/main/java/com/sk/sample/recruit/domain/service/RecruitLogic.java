package com.sk.sample.recruit.domain.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sk.sample.recruit.domain.model.Recruit;
import com.sk.sample.recruit.domain.model.RecruitStatus;
import com.sk.sample.recruit.domain.repository.RecruitRepository;


@Service("recruitLogic")
public class RecruitLogic implements RecruitService {
	@Autowired
	private RecruitRepository recruitRepository;
	
	public RecruitLogic() {}
	
	public RecruitLogic(RecruitRepository recruitRepository)
	{
		this.recruitRepository = recruitRepository;
	}

	@Override
	@Transactional
	public Recruit register(Recruit recruit) {
//		String recruitID = "1";
//		RecruitStatus recruitStatus = RecruitStatus.WAITING;
//		String companyID = "";
		return recruitRepository.save(recruit);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<Recruit> findByApplicantId(String applicantId) {
		return recruitRepository.findByApplicantId(applicantId);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<Recruit> findByCompanyId(String companyId) {
		return recruitRepository.findByCompanyId(companyId);
	}

	@Override
	@Transactional
	public Recruit update(String recruitId, Recruit newRecruit) {
		Recruit oldRecruit = recruitRepository.findOne(Long.parseLong(recruitId));
		if(oldRecruit != null) {
			BeanUtils.copyProperties(newRecruit,  oldRecruit, "recruitId");
			return recruitRepository.save(oldRecruit);
		} else {
			return null;
		}
	}
}
