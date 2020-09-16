package com.intelliviz.petclinic.controllers;

import com.intelliviz.petclinic.services.VetService;
import com.intelliviz.petclinic.services.map.VetMapService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetControllerTest {

    @Test
    void listVets() {
        VetMapService service = new VetMapService(null);
        VetController controller = new VetController(service);
        VetModel model = new VetModel();

        String result = controller.listVets(model);
        assertEquals("vets/index", result);

    }
}