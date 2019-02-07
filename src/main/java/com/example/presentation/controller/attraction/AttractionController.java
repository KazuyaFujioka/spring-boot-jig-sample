package com.example.presentation.controller.attraction;

import com.example.application.service.attraction.AttractionQueryService;
import com.example.domain.model.attraction.Attraction;
import com.example.domain.model.attraction.AttractionCode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * アトラクションの詳細
 */
@Controller
@RequestMapping("attraction")
class AttractionController {

    @GetMapping
    String index() {
        Attraction attraction = attractionQueryService.findBy(new AttractionCode("pln1234567"));
        return "index";
    }

    AttractionQueryService attractionQueryService;

    AttractionController(AttractionQueryService attractionQueryService) {
        this.attractionQueryService = attractionQueryService;
    }
}