package com.company.model;


import java.util.List;
import java.util.Objects;

public class UserList {
    private List<User> users;
    private int count;

    public UserList(List<User> users, int count) {
        this.users = users;
        this.count = count;
    }

        public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
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
        UserList that = (UserList) o;
        return count == that.count && Objects.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, count);
    }
}
