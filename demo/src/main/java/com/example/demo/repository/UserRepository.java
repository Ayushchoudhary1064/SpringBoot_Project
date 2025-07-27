package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.User;

// No need to implement anything, Spring Data JPA provides everything!
public interface UserRepository extends JpaRepository<User, Long> {
    // You can define custom queries here if needed
}
