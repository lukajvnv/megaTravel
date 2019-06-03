package com.project.megatravel.events;

import java.io.Serializable;

import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Role;

import com.project.megatravel.model.accomodation.Lokacija;

@Role(Role.Type.EVENT)
@Expires("90s")
public class EarlyBirdEvent implements Serializable {
	
	private Lokacija lokacija;
	
	public EarlyBirdEvent() {
		super();
	}
	
	public EarlyBirdEvent(Lokacija l) { 
		lokacija = l;
	}

	public Lokacija getLokacija() {
		return lokacija;
	}

	public void setLokacija(Lokacija lokacija) {
		this.lokacija = lokacija;
	}
	
}
