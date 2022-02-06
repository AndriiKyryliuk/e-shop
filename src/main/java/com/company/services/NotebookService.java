package com.company.services;

import com.company.dao.NotebookRepository;
import com.company.model.Notebook;
import com.company.model.NotebookList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotebookService {
    @Autowired
    private NotebookRepository repository;

    public Notebook getNotebook() {
        return repository.findById(1).get();
    }

    public NotebookList getNotebookList() {
        Notebook notebook1 = new Notebook(1, 2, 250, "ASUS", "530");
        Notebook notebook2 = new Notebook(2, 4, 400, "HP", "g6");
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(notebook1);
        notebooks.remove(notebook1);
        notebooks.add(0, notebook2);
        notebooks.get(0);
        notebooks.add(notebook2);
        return new NotebookList(notebooks, 5);
    }
}
