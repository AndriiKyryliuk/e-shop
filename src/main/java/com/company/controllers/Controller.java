package com.company.controllers;

import com.company.model.Notebook;
import com.company.model.NotebookList;
import com.company.model.Response;
import com.company.services.NotebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private NotebookService service;

    @GetMapping("/")
    public Response<Notebook> rest() {
        return new Response<Notebook>(service.getNotebook(), HttpStatus.OK);
    }

    @GetMapping("/hdd")
    public int getHdd() {
        return service.getNotebook().getHdd();
    }

    @GetMapping("/list")
    public NotebookList getList() {
        return service.getNotebookList();
    }


}

