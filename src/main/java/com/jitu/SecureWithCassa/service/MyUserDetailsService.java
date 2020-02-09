package com.jitu.SecureWithCassa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jitu.SecureWithCassa.model.User;
import com.jitu.SecureWithCassa.pricipal.UserPrincipal;
import com.jitu.SecureWithCassa.repository.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService{

	
	@Autowired
	private UserRepo userRepo; 
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUsername(username);
		if(null == user)
			throw new UsernameNotFoundException("No User Found");
		return new UserPrincipal(user);
	}
}
