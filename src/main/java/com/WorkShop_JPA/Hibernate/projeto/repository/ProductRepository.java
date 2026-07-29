package com.WorkShop_JPA.Hibernate.projeto.repository;

import com.WorkShop_JPA.Hibernate.projeto.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
