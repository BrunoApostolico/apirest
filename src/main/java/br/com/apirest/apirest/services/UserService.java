package br.com.apirest.apirest.services;

import br.com.apirest.apirest.domain.Users;

import java.util.List;

public interface UserService {
    Users findById(Integer id);
    List<Users> findAll();
}
