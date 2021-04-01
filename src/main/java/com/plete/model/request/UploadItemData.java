package com.plete.model.request;

import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UploadItemData {

    private String name;

    private String title;

    private String content;

    private BigDecimal price;

    private String brand_name;
    
    private String title_img;
    
    private List<String> multi_img;


}
