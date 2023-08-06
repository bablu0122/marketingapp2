package com.marketnew_app2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketnew_app2.entity.Lead;
import com.marketnew_app2.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	public LeadRepository leadRepo;

	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);

	}

	@Override
	public List<Lead> listLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public void deleteLead(long id) {
		leadRepo.deleteById(id);
	}

	@Override
	public Lead findLead(long id) {
      Optional<Lead> findById = leadRepo.findById(id);
      Lead lead = findById.get();
      return lead;
	}
	
	

}
