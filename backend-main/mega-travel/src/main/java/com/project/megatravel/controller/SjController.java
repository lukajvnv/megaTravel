package com.project.megatravel.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.megatravel.model.accomodation.SmestajnaJedinica;
import com.project.megatravel.model.accomodation.SmestajniObjekat;
import com.project.megatravel.repository.SjRepository;
import com.project.megatravel.repository.SoRepository;

@RestController
@RequestMapping("/sj")
@CrossOrigin(origins = "http://localhost:4300")
public class SjController {
	
	@Autowired
	private SjRepository repo;

	
	@RequestMapping(method = RequestMethod.GET, path="/{id}")
	public ResponseEntity<SmestajnaJedinica> getReservation(@PathVariable("id") Long id) {
		SmestajnaJedinica rez = repo.getOneById(id);
		
		return new ResponseEntity<SmestajnaJedinica>(rez, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, path="/units/{id}")
	public ResponseEntity<Collection<SmestajnaJedinica>> getUnitsOfObject(@PathVariable("id") Long id) {
		Collection<SmestajnaJedinica> rez = repo.getAll();
		Collection<SmestajnaJedinica> ret = new ArrayList<>();
		for (SmestajnaJedinica smestajnaJedinica : rez) {
			if(smestajnaJedinica.getSObjekat() == id) {
				ret.add(smestajnaJedinica);
			}
		}
		
		return new ResponseEntity<Collection<SmestajnaJedinica>>(ret, HttpStatus.OK);
	}
	
}