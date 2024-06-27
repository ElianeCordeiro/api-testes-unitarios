package com.java.testes_unitarios.api_rest.services;

import com.java.testes_unitarios.api_rest.domain.User;

public interface UserService {

    User findById(Integer id);
}
