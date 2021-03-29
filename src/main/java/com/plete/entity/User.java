package com.plete.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class User {

    private Long id;

    private String account;

    private String password;
    
    private String salt;

    private String status;      // REGISTERED / UNREGISTERED / WAITING

    private String email;

    private String phoneNumber;

    private String registeredAt;

    private String unregisteredAt;

    private String createdAt;

    private String createdBy;

    private String updatedAt;

    private String updatedBy;

    private List<OrderGroup> orderGroupList;

}
