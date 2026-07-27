package com.WorkShop_JPA.Hibernate.projeto.resources;

import com.WorkShop_JPA.Hibernate.projeto.entities.User;
import com.WorkShop_JPA.Hibernate.projeto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserRepository repo;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = repo.findAll();
        return ResponseEntity.ok().body(list);
    }
}
