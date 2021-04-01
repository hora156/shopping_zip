package com.plete.model.response;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

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

    private String name;

    private String title;

    private String content;

    private BigDecimal price;

    private String brand_name;
    
    private MultipartFile title_img;
    
    private List<MultipartFile> multi_img;


}
