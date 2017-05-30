package com.epam.data;

import com.epam.Product;

import java.math.BigDecimal;

public class Stock {
    private MemoryDataStore<Product> memoryDataStore = new MemoryDataStore<Product>();

    public Stock() {
        memoryDataStore.add(new Product("Book", new BigDecimal("100")));
        memoryDataStore.add(new Product("UberLaptop", new BigDecimal("10000")));
    }

    public void add(Product product) {
        memoryDataStore.add(product);
    }

    public Iterable<Product> list() {
        return memoryDataStore.list();
    }
}
