package br.com.apirest.apirest.services.impl;

import br.com.apirest.apirest.domain.Users;
import br.com.apirest.apirest.repositories.UserRepository;
import br.com.apirest.apirest.services.UserService;
import br.com.apirest.apirest.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public Users findById(Integer id) {
        Optional<Users> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
