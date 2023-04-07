package br.com.apirest.apirest.services.impl;

import br.com.apirest.apirest.domain.Users;
import br.com.apirest.apirest.domain.dto.UserDTO;
import br.com.apirest.apirest.repositories.UserRepository;
import br.com.apirest.apirest.services.UserService;
import br.com.apirest.apirest.services.exceptions.DataIntegratyViolationException;
import br.com.apirest.apirest.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Users findById(Integer id) {
        Optional<Users> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Users> findAll() {
        return repository.findAll();
    }

    @Override
    public Users create(UserDTO obj) {
        findByEmail(obj);
        return repository.save(mapper.map(obj, Users.class));
    }

    @Override
    public Users update(UserDTO obj) {
        findByEmail(obj);
        return repository.save(mapper.map(obj, Users.class));
    }

    @Override
    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);
    }

    private void findByEmail (UserDTO obj){
        Optional<Users> user = repository.findByEmail(obj.getEmail());
        if(user.isPresent() && !user.get().getId().equals(obj.getId())){
            throw new DataIntegratyViolationException("E-mail ja cadastrado no sistema");
        }
    }
}
