package com.intelliviz.petclinic.controllers;

import com.intelliviz.petclinic.fauxspring.Model;

import java.util.HashMap;
import java.util.Map;

public class VetModel implements Model {
    private Map<String, Object> map = new HashMap<>();
    @Override
    public void addAttribute(String key, Object o) {
        map.put(key, o);
    }

    @Override
    public void addAttribute(Object o) {

    }
}
