package com.specialteam.coffeshop.service;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.specialteam.coffeshop.model.Product;
import com.specialteam.coffeshop.model.ProductImage;
import com.specialteam.coffeshop.repository.ProductRepository;
import com.specialteam.coffeshop.request.ProductRequest;
import com.specialteam.coffeshop.response.ProductResponse;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public ResponseEntity<ProductResponse<Product>> addProduct(String request, MultipartFile file) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ProductResponse<Product> response;

        try {
            ProductRequest productRequest = mapper.readValue(request, ProductRequest.class);
            Product entity = new Product();
            entity.setId(UUID.randomUUID().toString());
            entity.setName(productRequest.getName());
            entity.setDescription(productRequest.getDescription());
            entity.setPrice(productRequest.getPrice());
            entity.setQuantity(1);
            entity.setImage(imageToBytes(file));
            repository.save(entity);

            response = new ProductResponse<>();
            response.setError(false);
            response.setResults(entity);
            response.setStatus("success");

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            log.error(e.getMessage());
            throw e;
        }
    }

    private ProductImage imageToBytes(MultipartFile file) {
        ProductImage image = new ProductImage();
        try {
            image.setFilename(file.getOriginalFilename());
            image.setMimeType(file.getContentType());
            image.setContent(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        } catch (IOException e) {
            log.error("ImageToBytes error : ", e.getMessage());
            e.printStackTrace();
        }
        return image;
    }

    public ResponseEntity<ProductResponse<List<Product>>> getProductsResponse() {
        ProductResponse<List<Product>> response;

        response = new ProductResponse<>();
        response.setError(false);
        response.setResults(repository.findAll());
        response.setStatus("success");
        return ResponseEntity.ok().body(response);

    }

}
