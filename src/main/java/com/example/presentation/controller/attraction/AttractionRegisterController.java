package com.example.presentation.controller.attraction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * アトラクションの登録
 */
@Controller
@RequestMapping("attraction")
class AttractionRegisterController {

    @PostMapping("register")
    void register() {
        attractionRegisterController.register();
    }

    AttractionRegisterController attractionRegisterController;

    AttractionRegisterController(AttractionRegisterController attractionRegisterController) {
        this.attractionRegisterController = attractionRegisterController;
    }
}