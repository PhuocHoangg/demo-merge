package org.example.demomerge;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "Xin chào từ feature branch!";
    }


    @GetMapping("/user")
    public User getUser() {
        return new User(1L, "Alice");
    }
}

