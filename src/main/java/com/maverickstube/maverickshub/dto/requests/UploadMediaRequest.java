package com.maverickstube.maverickshub.dto.requests;

import com.maverickstube.maverickshub.data.constants.Category;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class UploadMediaRequest {
    private Long userId;
    private MultipartFile mediaFile;
    private String description;
    private Category category;
}
