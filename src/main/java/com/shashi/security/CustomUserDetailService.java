package com.shashi.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shashi.dao.UserLoginRepository;
import com.shashi.dao.UserRoleRepository;
import com.shashi.entity.UserLogin;

@Service("CustomUserDetailService")
public class CustomUserDetailService implements UserDetailsService{

	private final UserLoginRepository userRepository;
	private final UserRoleRepository userRolesRepository;
	
	@Autowired
    public CustomUserDetailService(UserLoginRepository userRepository,UserRoleRepository userRolesRepository) {
        this.userRepository = userRepository;
        this.userRolesRepository = userRolesRepository;
    }
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		UserLogin user=userRepository.findByUserName(username);
		if(null == user){
			throw new UsernameNotFoundException("No user present with username: "+username);
		}else{
			List<String> userRoles=userRolesRepository.findRoleByUserName(username);
			return new CustomUserDetails(user,userRoles);
		}
		
	}
	

	
}
