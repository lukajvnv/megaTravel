package com.project.megatravel.users.services;

import java.util.List;

import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.project.megatravel.model.users.Agent;
import com.project.megatravel.users.repository.AgentRepository;
import com.project.megatravel.users.request.LoginForm;

@Service
@CrossOrigin
public class AgentsService {

	@Autowired
	private AgentRepository repo;
	
	@Autowired
    private AuthenticationManager authenticationManager;
	
	public Agent getById(Long id) {
		
		Agent a = repo.getOneById(id);
		
		return a;
		
	}
	
	public List<Agent> getAll() {
		
		List<Agent> agents = (List<Agent>) repo.getAll();
		
		return agents;
		
	}

	public Agent save(Agent korisnik) {
		
		Agent agent = repo.save(korisnik);
		
		return agent;
	}

	public Agent deleteById(Long id) {
		
		Agent a = repo.deleteById(id);
		
		return a;
	}
	
	public Agent agentVerify(LoginForm loginRequest) {
		Agent agent= repo.getByEmail(loginRequest.getEmail());
    	
    	UsernamePasswordAuthenticationToken authReq
    	 = new UsernamePasswordAuthenticationToken( loginRequest.getEmail(), loginRequest.getPassword());
    	
    	authenticationManager.authenticate(authReq);
    	
    	return agent;
    
	}
	
	public Agent agentByEmail(String mail) {
		return repo.getByEmail(mail);
	}
	
	public String generatePassword() {
	    PasswordGenerator gen = new PasswordGenerator();
	    CharacterData lowerCaseChars = EnglishCharacterData.LowerCase;
	    CharacterRule lowerCaseRule = new CharacterRule(lowerCaseChars);
	    lowerCaseRule.setNumberOfCharacters(2);
	 
	    CharacterData upperCaseChars = EnglishCharacterData.UpperCase;
	    CharacterRule upperCaseRule = new CharacterRule(upperCaseChars);
	    upperCaseRule.setNumberOfCharacters(2);
	 
	    CharacterData digitChars = EnglishCharacterData.Digit;
	    CharacterRule digitRule = new CharacterRule(digitChars);
	    digitRule.setNumberOfCharacters(2);
	 
	    CharacterData specialChars = new CharacterData() {
	        public String getErrorCode() {
	            return "ERROR_CODE";
	        }
	 
	        public String getCharacters() {
	            return "!@#$%^&*()_+";
	        }
	    };
	    CharacterRule splCharRule = new CharacterRule(specialChars);
	    splCharRule.setNumberOfCharacters(2);
	 
	    String password = gen.generatePassword(10, splCharRule, lowerCaseRule, 
	      upperCaseRule, digitRule);
	    return password;
	}
	
}
