package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "farmImage")
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FarmImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    url(path), original name, thumbnail url
    private ImageType farmImage;


}
