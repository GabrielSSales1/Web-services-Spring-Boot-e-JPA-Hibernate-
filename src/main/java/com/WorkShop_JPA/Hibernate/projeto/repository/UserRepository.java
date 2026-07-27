package com.WorkShop_JPA.Hibernate.projeto.repository;

import com.WorkShop_JPA.Hibernate.projeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
