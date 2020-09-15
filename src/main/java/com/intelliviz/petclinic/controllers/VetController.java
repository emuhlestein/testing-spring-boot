package com.intelliviz.petclinic.controllers;

import com.intelliviz.petclinic.fauxspring.Model;
import com.intelliviz.petclinic.services.VetService;

public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    public String listVets(Model model){

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}