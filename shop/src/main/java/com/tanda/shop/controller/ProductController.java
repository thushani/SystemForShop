package com.tanda.shop.controller;

import com.tanda.shop.model.dto.ProductDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Thushani on 10/13/2020.
 */
@RestController
@RequestMapping("/product")

public class ProductController {
    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity productCreate(@Validated @RequestBody ProductDto product){
        System.out.println("productCreate " + product.getProductType());

        ResponseEntity res = new ResponseEntity(product, HttpStatus.ACCEPTED);
        return res;
    }

    @PutMapping(value = "/{productType}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity productUpdate(@Validated @RequestBody ProductDto product){
        System.out.println("productUpdate " + product.getProductType());

        ResponseEntity res = new ResponseEntity("{\"Status\":\"ok\"}", HttpStatus.ACCEPTED);
        return res;
    }

    @DeleteMapping(value = "/{productType}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity productDelete(@Validated @RequestBody ProductDto product){
        System.out.println("productDelete " + product.getProductType());

        ResponseEntity res = new ResponseEntity("ok", HttpStatus.ACCEPTED);
        return res;
    }
}
