package com.TpHost.AppSecurity.controller;

import com.TpHost.AppSecurity.DTO.RequestProductDTO;
import com.TpHost.AppSecurity.model.Product;
import com.TpHost.AppSecurity.repository.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RequestMapping("product")
@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;



    @GetMapping
    public ResponseEntity getAllProduct(){
        var allProducts = productRepository.findAllByActiveTrue();
        return ResponseEntity.ok(allProducts);
    }



    @PostMapping
    public ResponseEntity registerProduct(@RequestBody @Valid RequestProductDTO data){
        System.out.println(data);
        Product product = new Product(data);
        productRepository.save(product);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateProduct(@RequestBody @Valid RequestProductDTO data){
        Optional<Product> optionalProduct = productRepository.findById(data.id());
        if (optionalProduct.isPresent()){
            Product product = optionalProduct.get();
            product.setName(data.name());
            product.setPrice(data.price());
            return ResponseEntity.ok(product);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deleteProdut(@PathVariable String id){
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()){
            Product product = optionalProduct.get();
            product.setActive(false);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }




}
