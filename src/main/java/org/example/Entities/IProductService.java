package org.example.Entities;

public interface IProductService {
    default void sell(Product product, Customer customer) {

    }
}