package com.github.demideinherjar.webexampleproject.repository.entity;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * User entity
 */
@Data
@Entity
@Table(name = "web_user")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    @Column(name = "name")
    private String name;

    @Column(name = "login")
    private String login;

    @Column(name = "email")
    private String email;
}
