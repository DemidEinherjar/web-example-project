package com.github.demideinherjar.webexampleproject.repository.dto;

import lombok.Builder;
import lombok.Data;

/**
 * {@link UserDto} for safety data transfer {@link com.github.demideinherjar.webexampleproject.repository.entity.User}
 */
@Data
@Builder
public class UserDto {

    private Integer user_id;
    private String name;
    private String login;
    private String email;
}
