package br.com.apirest.apirest.services;

import br.com.apirest.apirest.domain.Users;
import br.com.apirest.apirest.domain.dto.UserDTO;

import java.util.List;

public interface UserService {
    Users findById(Integer id);
    List<Users> findAll();
    Users create(UserDTO obj);
    Users update(UserDTO obj);

}
