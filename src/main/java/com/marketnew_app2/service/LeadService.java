package com.marketnew_app2.service;

import java.util.List;

import com.marketnew_app2.entity.Lead;

public interface LeadService {
	
	public void saveLead(Lead lead);

	public  List<Lead> listLeads() ;
		
   public void deleteLead (long id);
   
   public Lead findLead (long id);
   
  

}
