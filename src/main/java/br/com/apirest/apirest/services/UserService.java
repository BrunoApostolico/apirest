package br.com.apirest.apirest.services;

import br.com.apirest.apirest.domain.Users;

public interface UserService {

    Users findById(Integer id);
}
