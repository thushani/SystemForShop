package com.tanda.shop.controller;

import com.tanda.shop.model.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Thushani on 10/12/2020.
 */
@RestController
@RequestMapping("/user")

public class userController {
    @PostMapping(value = "/customer", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity customerCreate(@Validated @RequestBody UserDto user){
        System.out.println("user Create " + user.getName());

        ResponseEntity res = new ResponseEntity(user, HttpStatus.ACCEPTED);
        return res;
    }

    @PostMapping(value = "/customer/login", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity customerLogin(@Validated @RequestBody UserDto user){
        System.out.println("user Login " + user.getName());

        ResponseEntity res = new ResponseEntity(user, HttpStatus.ACCEPTED);
        return res;
    }

    @PutMapping(value = "/customer/{userId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity customerUpdate(@Validated @RequestBody UserDto user){
        System.out.println("user update " + user.getName());

        ResponseEntity res = new ResponseEntity(user, HttpStatus.ACCEPTED);
        return res;
    }

    @DeleteMapping(value = "/customer/{userId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity customerDelete(@Validated @RequestBody UserDto user){
        System.out.println("user delete " + user.getName());

        ResponseEntity res = new ResponseEntity(user, HttpStatus.ACCEPTED);
        return res;
    }


}
