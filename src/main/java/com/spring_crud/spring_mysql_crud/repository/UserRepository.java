package com.spring_crud.spring_mysql_crud.repository;

import com.spring_crud.spring_mysql_crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
