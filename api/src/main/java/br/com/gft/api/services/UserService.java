package br.com.gft.api.services;

import br.com.gft.api.domain.User;
import br.com.gft.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

	User findById(Integer id);
	List<User> findAll();
	User create(UserDTO obj);
	User update(UserDTO obj);
	void delete(Integer id);

}
