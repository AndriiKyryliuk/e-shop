package com.company.dao;

import com.company.model.Notebook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotebookRepository extends CrudRepository<Notebook, Integer> {
}
