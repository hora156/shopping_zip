package com.plete.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MultiFileUploadRequest {
	
	private Long item_id;
	
	private String real_path_file_name;
	
	
}
