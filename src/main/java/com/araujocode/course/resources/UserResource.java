package com.araujocode.course.resources;

import com.araujocode.course.entities.User;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(10L, "bruno", "bruno@gmail.com", "11991003883", "12345");
        return ResponseEntity.ok().body(u);
    }
}
