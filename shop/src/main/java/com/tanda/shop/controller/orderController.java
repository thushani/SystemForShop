package com.tanda.shop.controller;

import com.tanda.shop.model.dto.OrderDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class orderController {

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity orderCreate(@Validated @RequestBody OrderDto order){
        System.out.println("orderCreate" + order.getName());

        ResponseEntity res = new ResponseEntity(order, HttpStatus.ACCEPTED);
        return res;
    }

    @PutMapping(value = "/{orderId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity orderUpdate(@Validated @RequestBody OrderDto order){
        System.out.println("orderUpdated" + order.getName());

        ResponseEntity res = new ResponseEntity("{\"Status\":\"ok\"}", HttpStatus.ACCEPTED);
        return res;
    }

    @DeleteMapping(value = "/{orderId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity orderDelete(@Validated @RequestBody OrderDto order){
        System.out.println("orderDeleted" + order.getName());

        ResponseEntity res = new ResponseEntity("ok", HttpStatus.ACCEPTED);
        return res;
    }
}
