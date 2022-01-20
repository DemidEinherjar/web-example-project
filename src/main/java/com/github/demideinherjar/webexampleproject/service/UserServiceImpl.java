package com.github.demideinherjar.webexampleproject.service;

import com.github.demideinherjar.webexampleproject.exception.ValidationException;
import com.github.demideinherjar.webexampleproject.repository.UserRepository;
import com.github.demideinherjar.webexampleproject.repository.dto.UserDto;
import com.github.demideinherjar.webexampleproject.repository.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

/**
 * Implementation of {@link UserService}.
 */
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserConverter userConverter;

    private void validateUserDto(UserDto userDto) throws ValidationException {

        if(isNull(userDto)) {
            throw new ValidationException("Object user is null");
        }
        if(isNull(userDto.getLogin()) || userDto.getLogin().isEmpty()) {
            throw new ValidationException("Login is empty");
        }
    }

    @Override
    public UserDto saveUser(UserDto userDto) throws ValidationException {
        validateUserDto(userDto);
        User savedUser = userRepository.save(userConverter.fromUserDtoToUser(userDto));
        return userConverter.fromUserToUserDto(savedUser);
    }

    @Override
    public void deleteUser(Integer user_id) {
        userRepository.deleteById(user_id);
    }

    @Override
    public UserDto findByLogin(String login) {
        User user = userRepository.findByLogin(login);
        if(user != null) {
            return userConverter.fromUserToUserDto(user);
        } else {
            return null;
        }
    }

    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll().stream()
                .map(userConverter::fromUserToUserDto)
                .collect(Collectors.toList());
    }
}
