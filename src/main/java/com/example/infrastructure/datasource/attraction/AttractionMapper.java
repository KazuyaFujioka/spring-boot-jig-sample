package com.example.infrastructure.datasource.attraction;

import com.example.domain.model.attraction.Attraction;
import com.example.domain.model.attraction.AttractionCode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
interface AttractionMapper {

    void register(@Param("attraction") Attraction attraction);

    Attraction findBy(@Param("attractionCode") AttractionCode attractionCode);
}