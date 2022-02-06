package com.company.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Notebook {
    @Id
    private Integer id;
    private int processor;
    private int hdd;
    private String producer;
    private String model;

    public Notebook(Integer id, int processor, int hdd, String producer, String model) {
        this.id = id;
        this.processor = processor;
        this.hdd = hdd;
        this.producer = producer;
        this.model = model;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getProcessor() {
        return processor;
    }

    public void setProcessor(int processor) {
        this.processor = processor;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return processor == notebook.processor && hdd == notebook.hdd && Objects.equals(id, notebook.id) && Objects.equals(producer, notebook.producer) && Objects.equals(model, notebook.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, processor, hdd, producer, model);
    }
}
