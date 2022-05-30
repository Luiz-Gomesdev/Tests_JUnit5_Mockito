package br.com.gft.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gft.api.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
