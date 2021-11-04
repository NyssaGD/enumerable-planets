package org.launchcode.enumerableplanets.controllers;

import org.launchcode.enumerableplanets.data.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanetController {

    @GetMapping()
    public String displayIndex(Model model) {
        model.addAttribute("planets", Data.Planets.values());
        return "index";
    }
}
