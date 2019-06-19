package com.project.megatravel.controller.ws.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.project.megatravel.model.messages.rating.managment.GetRatingRequest;
import com.project.megatravel.model.messages.rating.managment.GetRatingResponse;


public class AccomodationRatingClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(AccomodationRatingClient.class);

	public GetRatingResponse getCountry(String country) {

		GetRatingRequest request = new GetRatingRequest();
		

		log.info("Requesting location for " + country);

		GetRatingResponse response = (GetRatingResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8836/agent/ws/accomodationRating", request,
						new SoapActionCallback(
								"www.model.megatravel.project.com/messages/rating/managment"));
		
		
        
		return response;
	}
}