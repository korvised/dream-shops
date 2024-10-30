package com.korvised.dreamshops.service.image;

import com.korvised.dreamshops.dto.ImageDto;
import com.korvised.dreamshops.medel.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);

    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);

    void updateImage(MultipartFile file, Long id);

    void deleteImage(Long id);
}
