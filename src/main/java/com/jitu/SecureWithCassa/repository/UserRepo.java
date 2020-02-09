package com.jitu.SecureWithCassa.repository;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.jitu.SecureWithCassa.model.User;


@Repository
public interface UserRepo extends CassandraRepository<User, String> {
	
	@AllowFiltering
	User findByUsername(String username);

}
