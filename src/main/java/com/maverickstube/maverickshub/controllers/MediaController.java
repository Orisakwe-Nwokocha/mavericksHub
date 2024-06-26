package com.maverickstube.maverickshub.controllers;

import com.maverickstube.maverickshub.dto.requests.UploadMediaRequest;
import com.maverickstube.maverickshub.services.MediaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;

@RestController
@RequestMapping("/api/v1/media")
@AllArgsConstructor
public class MediaController {
    private final MediaService mediaService;

    @PostMapping(consumes = {MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<?> uploadMedia(@ModelAttribute UploadMediaRequest uploadMediaRequest) {
        return ResponseEntity.status(CREATED).body(mediaService.upload(uploadMediaRequest));
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getMediaForUser(@PathVariable Long userId) {
        return ResponseEntity.ok().body(mediaService.getMediaFor(userId));
    }
}
