package com.company.controllers;

import com.company.model.*;
import com.company.services.NotebookService;
import com.company.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private NotebookService service;
    @Autowired
    private UserService userService;

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

    @GetMapping("/user/notebooks")
    public Response<UserNotebook> getUserNotebooks() {
        return new Response<UserNotebook>(service.getUserNotebook(), HttpStatus.OK);
    }
    @GetMapping("/users")
    public Response<UserList> getUsers() {
        return new Response<UserList>(userService.getUserList(), HttpStatus.OK);
    }


}

