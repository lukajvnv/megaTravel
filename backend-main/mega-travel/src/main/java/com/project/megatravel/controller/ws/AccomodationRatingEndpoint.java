package com.project.megatravel.controller.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.project.megatravel.model.messages.rating.managment.AnswerMessageRequest;
import com.project.megatravel.model.messages.rating.managment.AnswerMessageResponse;
import com.project.megatravel.model.messages.rating.managment.GetCommentsByObjectRequest;
import com.project.megatravel.model.messages.rating.managment.GetCommentsByObjectResponse;
import com.project.megatravel.model.messages.rating.managment.GetCommentsByUnitRequest;
import com.project.megatravel.model.messages.rating.managment.GetCommentsByUnitResponse;
import com.project.megatravel.model.messages.rating.managment.GetMessageRequest;
import com.project.megatravel.model.messages.rating.managment.GetMessageResponse;
import com.project.megatravel.model.messages.rating.managment.GetMessagesRequest;
import com.project.megatravel.model.messages.rating.managment.GetMessagesResponse;
import com.project.megatravel.model.messages.rating.managment.GetRatingByObjectRequest;
import com.project.megatravel.model.messages.rating.managment.GetRatingByObjectResponse;
import com.project.megatravel.model.messages.rating.managment.GetRatingByUnitRequest;
import com.project.megatravel.model.messages.rating.managment.GetRatingByUnitResponse;



@Endpoint
public class AccomodationRatingEndpoint {
	
	private static final Logger log = LoggerFactory.getLogger(AccomodationRatingEndpoint.class);

	private static final String NAMESPACE_URL = "www.model.megatravel.project.com/messages/rating/managment";
	
	private static final String RATING_URL = "http://localhost:8010/rating-module/us-central1/"; 
	
	@Autowired
	private RestTemplate restClient;
	
	@PayloadRoot(namespace = NAMESPACE_URL, localPart = "getRatingByObjectRequest")
	@ResponsePayload
	public GetRatingByObjectResponse getRatingByObject(@RequestPayload GetRatingByObjectRequest rating) {
		
		log.info("getRatingByObject webservice method invoked");
		ResponseEntity<String> average = restClient.getForEntity(RATING_URL + "/hello", String.class);

		return new GetRatingByObjectResponse();
	}
	
	@PayloadRoot(namespace = NAMESPACE_URL, localPart = "getRatingByUnitRequest")
	@ResponsePayload
	public GetRatingByUnitResponse getRatingByUnit(@RequestPayload GetRatingByUnitRequest rating) {

		log.info("getRatingByUnit webservice method invoked");
	
		long room = rating.getUnitId();
		
		try {
			ResponseEntity<Double> average = restClient.postForEntity(RATING_URL + "averageGrade", room, Double.class);
			log.info("Rating za sobu broj" + room + " je" + average);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new GetRatingByUnitResponse();
	}
	
	@PayloadRoot(namespace = NAMESPACE_URL, localPart = "getCommentsByObjectRequest")
	@ResponsePayload
	public GetCommentsByObjectResponse getCommentsByObject(@RequestPayload GetCommentsByObjectRequest rating) {

		log.info("getCommentsByObject webservice method invoked");

		return new GetCommentsByObjectResponse();
	}
	
	@PayloadRoot(namespace = NAMESPACE_URL, localPart = "getCommentsByUnitRequest")
	@ResponsePayload
	public GetCommentsByUnitResponse getCommentsByUnitRating(@RequestPayload GetCommentsByUnitRequest rating) {

		log.info("getCommentsByUnitRating webservice method invoked");

		return new GetCommentsByUnitResponse();
	}
	
	@PayloadRoot(namespace = NAMESPACE_URL, localPart = "getMessagesRequest")
	@ResponsePayload
	public GetMessagesResponse getMessages(@RequestPayload GetMessagesRequest rating) {

		log.info("getMessages webservice method invoked");

		/// TODO: dobavljanje poruka
		
		return new GetMessagesResponse();
	}
	
	@PayloadRoot(namespace = NAMESPACE_URL, localPart = "getMessageRequest")
	@ResponsePayload
	public GetMessageResponse getMessage(@RequestPayload GetMessageRequest rating) {

		log.info("getMessage webservice method invoked");
		
		/// TODO: dobavljanje poruke

		return new GetMessageResponse();
	}
	
	@PayloadRoot(namespace = NAMESPACE_URL, localPart = "answerMessageRequest")
	@ResponsePayload
	public AnswerMessageResponse answerMessage(@RequestPayload AnswerMessageRequest rating) {

		log.info("answerMessage webservice method invoked");
		
		/// TODO: odgovor na poruku

		return new AnswerMessageResponse();
	}
	
}
