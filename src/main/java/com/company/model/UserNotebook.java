package com.company.model;

import java.util.Objects;

public class UserNotebook {
    private User user;
    private NotebookList notebookList;

    public UserNotebook(User user, NotebookList notebookList) {
        this.user = user;
        this.notebookList = notebookList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public NotebookList getNotebookList() {
        return notebookList;
    }

    public void setNotebookList(NotebookList notebookList) {
        this.notebookList = notebookList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserNotebook that = (UserNotebook) o;
        return Objects.equals(user, that.user) && Objects.equals(notebookList, that.notebookList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, notebookList);
    }
}
