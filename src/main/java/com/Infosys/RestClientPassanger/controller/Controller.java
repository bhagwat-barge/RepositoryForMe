package com.Infosys.RestClientPassanger.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Infosys.RestClientPassanger.model.Passenger;
import com.Infosys.RestClientPassanger.model.Ticket;
import com.Infosys.RestClientPassanger.service.PassengerService;


@RestController
public class Controller {

	
	@Autowired
	private PassengerService pService;
	
	@PostMapping(value = "/getClient", produces = "application/json")
	public ResponseEntity<Ticket> getData(@RequestBody Passenger passenger){
		Ticket bookData = pService.getBookData(passenger);
		
		return new ResponseEntity<Ticket>(bookData, HttpStatus.OK);
	}
}
