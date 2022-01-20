package com.github.demideinherjar.webexampleproject.service;

import com.github.demideinherjar.webexampleproject.exception.ValidationException;
import com.github.demideinherjar.webexampleproject.repository.dto.UserDto;

import java.util.List;

/**
 * Service for handling {@link UserDto}
 */
public interface UserService {

    UserDto saveUser(UserDto userDto) throws ValidationException;

    void deleteUser(Integer user_id);

    UserDto findByLogin(String login);

    List<UserDto> findAll();
}
