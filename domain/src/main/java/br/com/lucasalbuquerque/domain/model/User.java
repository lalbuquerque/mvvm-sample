package br.com.lucasalbuquerque.domain.model;

import com.sun.istack.internal.Nullable;

public class User {
    private String name;
    private boolean inPomodoro;

    public User(@Nullable String name, @Nullable boolean inPomodoro) {
        this.name = name;
        this.inPomodoro = inPomodoro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInPomodoro() {
        return inPomodoro;
    }

    public void setInPomodoro(boolean inPomodoro) {
        this.inPomodoro = inPomodoro;
    }
}
