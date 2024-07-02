package com.java.testes_unitarios.api_rest.config;

import com.java.testes_unitarios.api_rest.domain.User;
import com.java.testes_unitarios.api_rest.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void startDB(){
        User user1 = new User(null, "Eliane", "eliane@gmail.com", "123");
        User user2 = new User(null, "Maria", "maria@gmail.com", "456");

        repository.saveAll(List.of(user1, user2));
    }
}
