package com.example.domain.model.attraction;

/**
 * アトラクションコード
 */
public class AttractionCode {

    String value;

    public AttractionCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private AttractionCode() {
    }
}