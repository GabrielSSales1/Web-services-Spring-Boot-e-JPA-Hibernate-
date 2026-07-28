package com.WorkShop_JPA.Hibernate.projeto.repository;

import com.WorkShop_JPA.Hibernate.projeto.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
