package br.com.apirest.apirest.config;

import br.com.apirest.apirest.domain.Users;
import br.com.apirest.apirest.repositories.UserRepository;
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

    @Bean
    public void startDB(){
        Users u1 = new Users(null,"Bruno", "bruno@email","123");
        Users u2 = new Users(null,"Priscila", "priscila@email","123");

        repository.saveAll(List.of(u1,u2));
    }
}
