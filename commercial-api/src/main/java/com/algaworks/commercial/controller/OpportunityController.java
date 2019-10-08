package com.algaworks.commercial.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.commercial.model.Opportunity;
import com.algaworks.commercial.repository.OpportunityRepository;

@RestController
@RequestMapping("/opportunities")
public class OpportunityController {

	@Autowired
	private OpportunityRepository opportunityRepo;

	@GetMapping
	public List<Opportunity> showAll() {

		return opportunityRepo.findAll();

	}

	@GetMapping("/{id}")
	public ResponseEntity<Opportunity> show(@PathVariable Long id) {
		Optional<Opportunity> opportunity = opportunityRepo.findById(id);

		if (opportunity.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(opportunity.get());
	}

}
