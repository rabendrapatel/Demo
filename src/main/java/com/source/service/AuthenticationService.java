package com.source.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthenticationService implements UserDetailsService {


	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		return new org.springframework.security.core.userdetails.User("ASsaAS", "asAAs",
				new ArrayList<>());
	}
}