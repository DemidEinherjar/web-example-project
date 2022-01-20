package com.github.demideinherjar.webexampleproject.service;

import com.github.demideinherjar.webexampleproject.repository.dto.UserDto;
import com.github.demideinherjar.webexampleproject.repository.entity.User;
import org.springframework.stereotype.Component;

/**
 * Converte {@link UserDto} in {@link User} and back.
 */
@Component
public class UserConverter {

    public User fromUserDtoToUser(UserDto userDto) {
        User user = new User();
        user.setUser_id(userDto.getUser_id());
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setLogin(userDto.getLogin());
        return user;
    }

    public UserDto fromUserToUserDto(User user) {
        return UserDto.builder()
                .user_id(user.getUser_id())
                .name(user.getName())
                .email(user.getEmail())
                .login(user.getLogin())
                .build();
    }
}
