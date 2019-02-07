package com.example.application.service.attraction;

import com.example.domain.model.attraction.Attraction;
import com.example.domain.model.attraction.AttractionCode;

import com.example.application.repository.AttractionRepository;

import org.springframework.stereotype.Service;

/**
 * アトラクション参照サービス
 */
@Service
public class AttractionQueryService {

    public Attraction findBy(AttractionCode attractionCode) {
        return attractionRepository.findBy(attractionCode);
    }

    AttractionRepository attractionRepository;

    AttractionQueryService(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }
}