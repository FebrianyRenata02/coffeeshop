package com.specialteam.coffeshop.model;

import org.bson.types.Binary;

import lombok.Data;

@Data
public class ProductImage {
    private String filename;
    private String mimeType;
    private Binary content;
}
