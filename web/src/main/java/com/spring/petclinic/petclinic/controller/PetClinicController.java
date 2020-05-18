package com.spring.petclinic.petclinic.controller;

import com.spring.petclinic.petclinic.services.OwnerService;
import com.spring.petclinic.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetClinicController {
    private final OwnerService ownerService;
    private final VetService vetService;

    public PetClinicController(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @RequestMapping({"/", "", "/index"})
    public String index(Model model) {
        return "index";
    }

    @RequestMapping({"/owner", "/owner/", "/owner/index", "/owner/index.html"})
    public String ownerList(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owner/OwnerIndex";
    }

    @RequestMapping({"/vet", "/vet/", "/vet/index", "/vet/index.html"})
    public String vetsList(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/VetsIndex";
    }
}
