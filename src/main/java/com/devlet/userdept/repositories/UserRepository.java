package com.devlet.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlet.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
