package com.shashi.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import com.shashi.entity.UserLogin;

public class CustomUserDetails extends UserLogin implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	public CustomUserDetails(UserLogin user) {
		super(user);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {			
		return AuthorityUtils.createAuthorityList("ROLE_USER");
	}

	@Override
	public String getUsername() {
		return super.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
