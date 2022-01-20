package com.example.bancowTest.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "farmImage")
@Data
public class FarmImage extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 원래 이미지 이름
    private String originalImageName;

    //UUID가 적용된 이미지 이름
    private String changedImageName;

    // 이미지 경로
    private String ImageUrl;

    // 썸네일
    private String thumbnailUrl;

    // 이미지 타입
    @Enumerated(EnumType.STRING)
    private ImageType farmImage;

    // 연관관계 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "farm_id")
    @JsonManagedReference
    private Farm farm;

}
