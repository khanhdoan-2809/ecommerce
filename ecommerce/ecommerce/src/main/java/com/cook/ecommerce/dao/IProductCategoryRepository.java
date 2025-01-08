package com.cook.ecommerce.dao;

import com.cook.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
// collectionResourceUrl: name of JSON entry
@RepositoryRestResource(collectionResourceRel = "productCategory", path="product-category")
public interface IProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
