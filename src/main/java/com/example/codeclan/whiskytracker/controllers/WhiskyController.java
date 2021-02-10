package com.example.codeclan.whiskytracker.controllers;

import com.example.codeclan.whiskytracker.respositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;


}
