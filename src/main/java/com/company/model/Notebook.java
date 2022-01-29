package com.company.model;

import java.util.Objects;

public class Notebook {
    private int processor;
    private int hdd;
    private String producer;
    private String model;

    public Notebook(int processor, int hdd, String producer, String model) {
        this.processor = processor;
        this.hdd = hdd;
        this.producer = producer;
        this.model = model;
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
        return processor == notebook.processor && hdd == notebook.hdd && Objects.equals(producer, notebook.producer) && Objects.equals(model, notebook.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, hdd, producer, model);
    }
}
