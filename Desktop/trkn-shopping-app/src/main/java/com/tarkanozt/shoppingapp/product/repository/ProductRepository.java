package com.tarkanozt.shoppingapp.product.repository;

import com.tarkanozt.shoppingapp.account.api.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
