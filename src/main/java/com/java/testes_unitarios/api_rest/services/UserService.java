package com.java.testes_unitarios.api_rest.services;

import com.java.testes_unitarios.api_rest.domain.User;
import com.java.testes_unitarios.api_rest.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO obj);

    User update(UserDTO obj);

    void delete(Integer id);
}
