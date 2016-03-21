package br.com.lucasalbuquerque.domain.model;

import java.util.List;

public class Contacts {
    List<User> users;

    public Contacts(@Nullable List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}