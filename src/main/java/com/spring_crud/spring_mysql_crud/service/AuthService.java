package com.spring_crud.spring_mysql_crud.service;


import com.spring_crud.spring_mysql_crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AuthService {
    @Autowired
    private UserRepository userRepository;
}
