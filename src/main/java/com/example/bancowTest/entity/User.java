package com.example.bancowTest.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;
    private String userPassword;

}
