package com.example.lnb.entity;

import lombok.Data;

@Data
public class User {

    private int id;
    private String username;
    private String password;
    private String address;
    private String phone;

}
