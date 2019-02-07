package com.example.infrastructure.datasource.attraction;

import com.example.domain.model.attraction.Attraction;
import com.example.domain.model.attraction.AttractionCode;

import com.example.application.repository.AttractionRepository;

import org.springframework.stereotype.Repository;

@Repository
class AttractionDataSource implements AttractionRepository {

    @Override
    public void register(Attraction attraction) {
        attractionMapper.register(attraction);
    }

    @Override
    public Attraction findBy(AttractionCode attractionCode) {
        return attractionMapper.findBy(attractionCode);
    }

    AttractionMapper attractionMapper;

    AttractionDataSource(AttractionMapper attractionMapper) {
        this.attractionMapper = attractionMapper;
    }
}