package com.java.testes_unitarios.api_rest.services;

import com.java.testes_unitarios.api_rest.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
