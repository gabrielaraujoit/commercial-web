package com.algaworks.commercial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
