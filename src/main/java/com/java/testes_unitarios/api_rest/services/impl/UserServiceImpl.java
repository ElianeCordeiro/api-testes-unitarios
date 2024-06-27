package com.java.testes_unitarios.api_rest.services.impl;

import com.java.testes_unitarios.api_rest.domain.User;
import com.java.testes_unitarios.api_rest.repositories.UserRepository;
import com.java.testes_unitarios.api_rest.services.UserService;
import com.java.testes_unitarios.api_rest.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado!"));
    }
}
