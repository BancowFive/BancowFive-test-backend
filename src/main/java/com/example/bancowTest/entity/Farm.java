package com.example.bancowTest.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "farm")
@Data
public class Farm extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 전화번호(필드이름 대체 예정)
    @Size(min = 10, max = 11)
    @Column(name = "phone_number")
    private String userName;

    // 인증번호(필드이름 대체 예정)
    @Size(min = 4, max = 4)
    private String password;

    // 약관 동의 (아마 여러개)
    private Boolean agreementCondition;

    // 이메일
    @Email
    private String email;

    // 페이지 저장
    private Long savedPage;


    // 농장주 이름
    private String name;

    // 사료
    private String feed;

    // 농장 주소
    private String farmAddress;

    // 농장 이름
    private String farmName;


    // 농장주 본인 확인
    private String identification;

    // 농장 자가 조사
    private String ownFarm;

    // 농장 시설 형태 조사
    private String farmFacilityType;

    // 가축의 수
    private String howManyCow;


    // 가축 사육업 등록증 유무
    private Boolean livestockBreedingBusinessRegistrationCertificateCheck;

    // 축사시설 구조도 유무
    private Boolean structuralDiagramOfLivestockFacilitiesCheck;

    // 1년간 사료비 명세서 유무
    private Boolean one_year_feed_cost_statement_check;

    // 1년간 출하성적서 유무
    private Boolean one_year_shipping_report_check;

    // 사업자 등록증 유무
    private Boolean business_registration_check;


    // 1차 작성중
    private LocalDateTime firstApplication;

    // 1차 제출
    private LocalDateTime firstComplete;

    // 2차 작성중
    private LocalDateTime secondApplication;

    // 2차 제출
    private LocalDateTime secondComplete;

    // 실사 요청일
    private LocalDateTime investigationRequest;

    // 실사 확정일
    private LocalDateTime investigationConfirm;

    // 입점 완료
    private LocalDateTime enteringConfirm;


    @JsonBackReference
    @OneToMany(mappedBy = "farm", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<FarmImage> farmImage = new ArrayList<>();


    @JsonBackReference
    @OneToMany(mappedBy = "farm", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<FarmFile> farmFile = new ArrayList<>();

    @OneToOne
    private User user;

}
