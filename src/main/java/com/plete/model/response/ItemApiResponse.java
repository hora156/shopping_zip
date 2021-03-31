package com.plete.model.response;

import java.math.BigDecimal;
import java.util.List;

import com.plete.entity.OrderDetail;
import com.plete.entity.Partner;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemApiResponse {

    private Long id;

    private String status;

    private String name;

    private String title;

    private String content;

    private BigDecimal price;

    private String brand_name;

    private String registered_at;

    private String unregistered_at;

    private String created_at;

    private String created_by;

    private String updated_at;

    private String updated_by;
    
    private String title_img;
    
    private String multi_img;

    // 1 : N
    // LAZY = 지연로딩, EAGER = 즉시로딩

    // LAZY = select * from item where id = ?

    // EAGER = 연관관계가 설정된 모든 테이블을 조인한다.(성능저하 유발) 때문에 1:1일 때만 추천
    // item_id = order_detail.item_id
    // user_id = order_detail.user_id
    // where item.id = ?
    // JOIN item item0_ left outer join order_detail orderdetai1_ on item0_.id=orderdetai1_.item_id left outer join user user2_ on orderdetai1_.user_id=user2_.id

    // Item N : 1 Partner
    private Partner partner;

    // item 1 : N  OrderDetail
    private List<OrderDetail> orderDetailList;

}
