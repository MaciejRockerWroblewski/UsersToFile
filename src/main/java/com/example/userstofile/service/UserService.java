package com.example.userstofile.service;

import com.example.userstofile.api.model.User;
import com.example.userstofile.repository.UserEntity;
import com.example.userstofile.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository repository;

  // public UserService(UserRepository repository) {
  //     this.repository = repository;
   // }


    public void create(User user) {
        repository.save(UserEntity.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .login(user.getLogin())
                .build());

    }

    public void update(User user) {
        repository.save(UserEntity.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .login(user.getLogin())
                .build());
    }

    public void delete(Long id) {
        repository.delete(id);

    }

    public List<User> getAll() {
        return repository.getAll().stream()
                .map(ent -> User.builder()
                        .id(ent.getId())
                        .firstName(ent.getFirstName())
                        .lastName(ent.getLastName())
                        .login(ent.getLogin())
                        .build())
                .collect(Collectors.toList());

    }

}



