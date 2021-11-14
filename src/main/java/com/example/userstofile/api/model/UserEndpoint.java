package com.example.userstofile.api.model;

import com.example.userstofile.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/match")
@RequiredArgsConstructor
public class UserEndpoint {

    private final UserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody User user){
        userService.create(user);

    }
    @PutMapping
    public void updateMatch(@RequestBody User user){
        userService.update(user);
    }
    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@RequestParam Long id) {
        userService.delete(id);
    }
}
