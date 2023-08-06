package com.marketnew_app2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketnew_app2.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long>{

}
