package br.com.gft.api.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.gft.api.domain.User;
import br.com.gft.api.repositories.UserRepository;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        User u1 = new User(null, "Luiz", "luiz@mail.com", "12356");
        User u2 = new User(null, "Paulo", "paulo@mail.com", "123");
        

        repository.saveAll(List.of(u1, u2));
    }
}