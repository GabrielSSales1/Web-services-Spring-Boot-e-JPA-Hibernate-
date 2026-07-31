package com.WorkShop_JPA.Hibernate.projeto.repository;

import com.WorkShop_JPA.Hibernate.projeto.entities.OrderItem;
import com.WorkShop_JPA.Hibernate.projeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
