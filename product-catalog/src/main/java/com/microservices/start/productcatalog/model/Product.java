package com.microservices.start.productcatalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "product", type = "catalog")
public class Product {

    @Id
    private Long id;
    private String name;
    private Integer ammount;

    public Product(Long id, String name, Integer ammount) {
        this.id = id;
        this.name = name;
        this.ammount = ammount;
    }
}
