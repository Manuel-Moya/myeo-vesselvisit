package com.apmterminals.eommo.vesselvisit.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class vesselvisitController {
    
    @GetMapping()
    public String Get(){
        return "Hello World";
    }
}
