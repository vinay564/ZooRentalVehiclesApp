package edu.nwmissouri.teambearcats;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vinay Manavarthi
 */
public class ZooRentalIndexController {
    
    
    private static final String INTRODUCTION_MESSAGE = "Welcome to our ZooRentalVehicle App!";
    private static final String WELCOME_MESSAGE = "Welcome to our Zoo !";
    private static final String GOODBYE_MESSAGE = "Thank you for visiting our zoo!";
    private static final int NUMBER_OF_VEHICLE_TYPES = 12;

    /**
     * The @GetMapping annotation ensures that HTTP GET requests to / are mapped
     * to the index() method.Example:
     * https://spring.io/guides/gs/serving-web-content/
     *
     *
     * @param idParam - the id provided in the URL
     * @param model - the model that holds information from controller to view
     * @return
     */
    @GetMapping(path = "/")
    public String index(
            @RequestParam(name = "id", required = false, defaultValue = "0") String idParam,
            Model model) {
        model.addAttribute("id", idParam);
        model.addAttribute("name", "World");
        model.addAttribute("greeting", INTRODUCTION_MESSAGE);
        // associated with index.hmtl in src/main/resources/templates
        return "index";
    }

    /**
     * Map GET request to "/about" to about() method.
     *
     * @return filename from main/resources/templates folder
     */
    @GetMapping(path = "/about")
    public String about() {
        return "about";
    }


    /**
     * Map GET request to "/persons" to persons() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/persons")
    public String persons() {
        return "persons";
    }
    
}
