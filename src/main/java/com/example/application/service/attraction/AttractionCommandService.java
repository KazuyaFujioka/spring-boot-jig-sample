package com.example.application.service.attraction;

import com.example.application.repository.AttractionRepository;
import com.example.domain.model.attraction.Attraction;
import org.springframework.stereotype.Service;

/**
 * アトラクション登録サービス
 */
@Service
public class AttractionCommandService {

    public void register(Attraction attraction) {
        attractionRepository.register(attraction);
    }

    AttractionRepository attractionRepository;

    AttractionCommandService(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }
}