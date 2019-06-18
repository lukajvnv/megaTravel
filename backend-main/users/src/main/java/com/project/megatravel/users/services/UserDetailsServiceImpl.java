package com.project.megatravel.users.services;




import com.project.megatravel.model.users.KrajnjiKorisnik;
import com.project.megatravel.users.repository.KorisnikRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private KorisnikRepository userRepository;



    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

    	
        KrajnjiKorisnik user = userRepository.getByEmail(username);
        
        if(user == null) {
        	return null;
        } else {
        	 return UserPrinciple.build(user);
        }
               

       
    }
}