package br.com.lucasalbuquerque.domain.model;

import com.sun.istack.internal.Nullable;

public class CurrentUser extends User {
    Contacts contacts;

    public CurrentUser(@Nullable String name, @Nullable boolean inPomodoro, @Nullable Contacts contacts) {
        super(name, inPomodoro);
        this.contacts = contacts;
    }
}