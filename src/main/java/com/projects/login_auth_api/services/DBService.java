package com.projects.login_auth_api.services;

import com.projects.login_auth_api.domain.user.User;
import com.projects.login_auth_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void instanciaDB() {
        User user1 = new User(null, "Danilo Sérgio Araújo", "daniloaraujo@gmail.com.br", passwordEncoder.encode("123"));
        User user2 = new User(null, "Sara Rosa Rodrigues", "sara_rosa_rodrigues@gmail.com.br", passwordEncoder.encode("E2SogN4O52"));
        User user3 = new User(null, "Danilo Alexandre Eduardo da Mata", "danilo.alexandre.damata@fepextrusao.com.br", passwordEncoder.encode("Ze85lrzY2H"));
        User user4 = new User(null, "Victor Raul Augusto Gonçalves", "victor_raul_goncalves@fibran.com.br", passwordEncoder.encode("npnb8q0HpW"));
        User user5 = new User(null, "Lorena Vera Costa", "lorena_costa@truran.com.br", passwordEncoder.encode("bJpi1NN8DU"));
        User user6 = new User(null, "Mauro João Mendes Vidal", "maurovidal@gmail.com", passwordEncoder.encode("bJpi1NN8DU"));

        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6));
    }



}
