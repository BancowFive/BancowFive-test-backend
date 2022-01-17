package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "farmFile")
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FarmFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    url(path), original name, thumbnail url
    private FileType farmFile;
//
//    private FileType livestock_breeding_business_registration_certificate; //가축사업 등록증
//    private Enum structural_diagram_of_livestock_facilites; //축사시설 구조도
//    private Enum one_year_feed_cost_statment; //1년간 사료비 명세서
//    private Enum one_year_shipping_report; //1년간 출하 성적서
//    private Enum business_registration; //사업자 등록증
//    private Enum farmer_ID_card; //농장주 신분증

}
