package com.company.controllers;

import com.company.model.Notebook;
import com.company.services.NotebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private NotebookService service;
    @GetMapping
    public Notebook rest() {
        return service.getNotebook();
    }

    @GetMapping("/hdd")
    public int getHdd() {
        return service.getNotebook().getHdd();
    }

}
