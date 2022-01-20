package com.example.bancowTest.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "farmFile")
@Data
public class FarmFile extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 원래 파일 이름
    private String originalFileName;

    // UUID가 적용된 파일 이름
    private String changedFileName;

    // 파일 경로
    private String FileUrl;

    // 파일 타입
    @Enumerated(EnumType.STRING)
    private FileType farmFile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "farm_id")
    @JsonManagedReference
    private Farm farm;


}
