package br.com.gft.api.services;

import java.util.List;

import br.com.gft.api.domain.User;

public interface UserService {
	
	User findById(Integer id);
	List<User> findAll();

}
