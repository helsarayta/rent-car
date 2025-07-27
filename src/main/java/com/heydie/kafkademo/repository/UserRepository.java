package com.heydie.kafkademo.repository;

import com.heydie.kafkademo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
