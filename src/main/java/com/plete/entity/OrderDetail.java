package com.plete.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {

    private Long id;

    private String status;

    private LocalDateTime arrival_date;

    private Integer quantity;

    private BigDecimal total_price;

    private LocalDateTime created_at;

    private String created_by;

    private LocalDateTime updated_at;

    private String updated_by;
    
    private Long item_id;
    
    private Long order_group_id;
    
    private String name;

    // OrderDetail N : 1 Item
    private Item item;

    // OrderDetail N : 1 OrderGroup
    private OrderGroup orderGroup;


}
