package com.remindme.userservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String surname;
    @Enumerated(EnumType.STRING)
    private Position position;
    private String githubProfileUrl;

    public User(String firstName, String surname, Position position, String githubProfileUrl) {
        this.firstName = firstName;
        this.surname = surname;
        this.position = position;
        this.githubProfileUrl = githubProfileUrl;
    }
}
