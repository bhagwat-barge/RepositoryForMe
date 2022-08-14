package com.Infosys.RestClientPassanger.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.Infosys.RestClientPassanger.model.Passenger;
import com.Infosys.RestClientPassanger.model.Ticket;
@Service
public class PassengerService {

	
	public Ticket getBookData(Passenger passenger) {

//		Passenger p = new Passenger();

		WebClient webClient = WebClient.create();

		String url = "http://localhost:8182/bookTicket";
System.out.println(passenger);
		Ticket block = webClient.post()
				.uri(url)
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.body(BodyInserters.fromValue(passenger))
				.retrieve()
				.bodyToMono(Ticket.class)
				.block();
		System.out.println(block);
		
		return block;
		
	}
}
