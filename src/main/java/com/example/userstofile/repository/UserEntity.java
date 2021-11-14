package com.example.userstofile.repository;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class UserEntity {
@Setter
    private Long id;
    private String firstName;
    private String lastName;
    private String login;
}
