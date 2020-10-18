package com.tanda.shop.model.dto;

import com.tanda.shop.util.UserRoles;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * Created by Thushani on 10/13/2020.
 */
public class UserDto {
    @NotNull(message = "user role may not be null")
    private UserRoles userRoles;
    private Long userId;
    @NotEmpty(message = "name may not be empty")
    private String name;
    @NotEmpty(message = "address may not be empty")
    private  String address;
    private  String email;
    @NotEmpty(message = "contact no may not be empty")
    private  String contactNo;
    private  int points;
    private  String userName;
    private  String password;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public UserRoles getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(UserRoles userRoles) {
        this.userRoles = userRoles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
