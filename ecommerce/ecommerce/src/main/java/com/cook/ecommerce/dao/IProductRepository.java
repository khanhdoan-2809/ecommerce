package com.cook.ecommerce.dao;

import com.cook.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "product", path="product")
public interface IProductRepository extends JpaRepository<Product, Long> {
}
