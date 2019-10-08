package com.algaworks.commercial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.commercial.model.Opportunity;

public interface OpportunityRepository extends JpaRepository<Opportunity, Long> {

}
