package com.deepak.repo;


import java.rmi.ServerException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.entity.CitizenPlan;

@RestController
@RequestMapping("/hii")
public class CitizenController {
	
	@Autowired
	CitizenPlanRepository repo;
	
	@GetMapping("/greet")
	public String greet() {
		return "hello";
	}

	
	
	@PostMapping("/save")
	public ResponseEntity<CitizenPlan> create(@RequestBody CitizenPlan newUser) throws ServerException {

	    CitizenPlan user = repo.save(newUser);
	    if (user == null) {
	        throw new ServerException(null);
	    } else {
	        return new ResponseEntity<>(user, HttpStatus.CREATED);
	    }
	}
}
