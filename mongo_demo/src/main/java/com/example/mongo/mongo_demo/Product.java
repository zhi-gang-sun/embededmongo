package com.example.mongo.mongo_demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
    @Id
    private String id;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrirce() {
        return this.prirce;
    }

    public void setPrirce(float prirce) {
        this.prirce = prirce;
    }
    private String name;
    private float prirce;
}
