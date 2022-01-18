package com.github.demideinherjar.webexampleproject.repository;

import com.github.demideinherjar.webexampleproject.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * {@link UserRepository} for handling with {@link User}
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByLogin(String login);
}
