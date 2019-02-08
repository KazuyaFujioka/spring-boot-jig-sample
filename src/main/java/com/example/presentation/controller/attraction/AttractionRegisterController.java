package com.example.presentation.controller.attraction;

import com.example.domain.model.attraction.Attraction;

import com.example.application.service.attraction.AttractionCommandService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * アトラクションの登録
 */
@Controller
@RequestMapping("attraction")
class AttractionRegisterController {

    @PostMapping("register")
    void register(@ModelAttribute("attraction") Attraction attraction) {
        attractionCommandService.register(attraction);
    }

    AttractionCommandService attractionCommandService;

    AttractionRegisterController(AttractionCommandService attractionCommandService) {
        this.attractionCommandService = attractionCommandService;
    }
}