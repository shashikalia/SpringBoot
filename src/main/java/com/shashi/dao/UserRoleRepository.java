package com.shashi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRoleRepository extends CrudRepository<UserRole, Long> {
	
	@Query("select a.role from UserRole a, User b where b.userName=?1 and a.userid=b.userId")
    public List<String> findRoleByUserName(String username);
	

}
