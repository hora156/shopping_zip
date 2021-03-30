package com.plete.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

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
public class OrderGroup {

    private Long id;

    private String status;

    private String order_type;   // 주문의 형태 - 일괄 / 개별

    private String rev_address;

    private String rev_name;

    private String payment_type; // 카드 / 현금

    private BigDecimal total_price;

    private Integer total_quantity;

    private LocalDateTime order_at;

    private LocalDateTime arrival_date;

    private LocalDateTime created_at;

    private String created_by;

    private LocalDateTime updated_at;

    private String updated_by;

    // OrderGroup N : 1 User
    private Long user_id;

    // OrderGroup 1 : N OrderDetail
    private List<OrderDetail> orderDetailList;

}
