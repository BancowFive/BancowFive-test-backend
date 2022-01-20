package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "farm")

@NoArgsConstructor
public class Farm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String userName;
    private String password;
    private String name;
    private String feed;
    private String farmAddress;
    private String farmName;
    private Boolean agreementCondition;
    private Date updatedAt;

    private Boolean identification;
    private Boolean ownFarm;
    private Boolean farmFacilityType;
    private Boolean livestockBreedingBusinessRegistrationCertificateCheck; // 가축사육업등록증유무
    private Boolean structuralDiagramOfLivestockFacilitesCheck; // 축사시설구조도유무
    private Boolean one_year_feed_cost_statement_check; //1년간사료비명세서유무
    private Boolean one_year_shipping_report_check; //1년간출하성적서유무
    private Boolean business_registration_check; // 사업자등록증유무

    private Date firstApplication;
    private Date firstComplete;
    private Date secondApplication;
    private Date secondComplete;
    private Date investigationRequest;
    private Date investigationConfirm;
    private Date enteringConfirm;

    @OneToMany(mappedBy = "farm" ,fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    private FarmImage farmImage;

    @OneToMany
    private FarmFile farmFile;

    @OneToOne
    private User user;

}
