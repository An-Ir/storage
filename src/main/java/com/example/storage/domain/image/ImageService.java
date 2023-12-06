package com.example.storage.domain.image;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Resource
    private ImageRepository imageRepository;

    public Image getImageBy(Integer id) {
        return imageRepository.findByStorageId(id);
    }
}
