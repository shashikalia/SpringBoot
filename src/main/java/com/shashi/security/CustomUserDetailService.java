package com.shashi.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shashi.dao.UserLoginRepository;
import com.shashi.entity.UserLogin;


@Service("CustomUserDetailService")
public class CustomUserDetailService implements UserDetailsService {

	private final UserLoginRepository userRepository;
	
	@Autowired
    public CustomUserDetailService(UserLoginRepository userRepository) {
        this.userRepository = userRepository;
    }
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		UserLogin user=userRepository.findByUserName(username);
		if(null == user){
			throw new UsernameNotFoundException("No user present with username: "+username);
		}else{
			return new CustomUserDetails(user);
		}
		
	}
	

	
}
