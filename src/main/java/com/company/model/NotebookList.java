package com.company.model;

import java.util.List;
import java.util.Objects;

public class NotebookList {

    private List<Notebook> notebooks;
    private int count;

    public NotebookList(List<Notebook> notebooks, int count) {
        this.notebooks = notebooks;
        this.count = count;
    }

    public List<Notebook> getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(List<Notebook> notebooks) {
        this.notebooks = notebooks;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotebookList that = (NotebookList) o;
        return count == that.count && Objects.equals(notebooks, that.notebooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notebooks, count);
    }
}
