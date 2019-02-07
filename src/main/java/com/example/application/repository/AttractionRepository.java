package com.example.application.repository;

import com.example.domain.model.attraction.Attraction;
import com.example.domain.model.attraction.AttractionCode;

/**
 * アトラクションリポジトリ
 */
public interface AttractionRepository {

    void register(Attraction attraction);

    Attraction findBy(AttractionCode attractionCode);
}