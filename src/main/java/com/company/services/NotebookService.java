package com.company.services;

import com.company.model.Notebook;
import org.springframework.stereotype.Service;

@Service
public class NotebookService {
    public Notebook getNotebook() {
        return new Notebook(3, 400,"HP", "g6");
    }
}
