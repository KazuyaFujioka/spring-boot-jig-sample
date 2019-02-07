package com.example.domain.model.attraction;

import com.example.domain.model.attraction.situation.Situation;

/**
 * アトラクション
 */
public class Attraction {

    Situation situation;

    Attraction(Situation situation) {
        this.situation = situation;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "situation=" + situation +
                '}';
    }

    private Attraction() {
    }
}