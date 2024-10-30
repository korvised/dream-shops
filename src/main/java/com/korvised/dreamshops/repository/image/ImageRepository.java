package com.korvised.dreamshops.repository.image;

import com.korvised.dreamshops.medel.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
