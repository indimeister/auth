package com.indimeister.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indimeister.auth.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
