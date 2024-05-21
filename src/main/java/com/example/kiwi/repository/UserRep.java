package com.example.kiwi.repository;

import com.example.kiwi.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRep extends JpaRepository<User, Long> {
    User findByUsername(String username);
}