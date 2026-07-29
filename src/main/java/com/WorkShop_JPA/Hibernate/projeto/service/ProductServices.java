package com.WorkShop_JPA.Hibernate.projeto.service;

import com.WorkShop_JPA.Hibernate.projeto.entities.Product;
import com.WorkShop_JPA.Hibernate.projeto.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository ProductRepository;

    public List<Product> findAll(){
        return ProductRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = ProductRepository.findById(id);
        return obj.orElseThrow();
    }
}
