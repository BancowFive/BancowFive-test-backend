package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user")
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String userId;
    private String userPassword;

}
