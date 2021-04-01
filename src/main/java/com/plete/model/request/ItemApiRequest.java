package com.plete.model.request;

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
public class ItemApiRequest {
	
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
    
    private MultipartFile title_img;
    
    private List<MultipartFile> multi_img;
    
    private String title_img_upload;
    
    private List<String> multi_img_upload;

}
