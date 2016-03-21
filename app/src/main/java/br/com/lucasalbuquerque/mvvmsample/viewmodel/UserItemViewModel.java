package br.com.lucasalbuquerque.mvvmsample.viewmodel;

import br.com.lucasalbuquerque.domain.model.User;

public class UserItemViewModel extends ItemViewModel<User> {
    private User user;

    @Override
    public void setItem(User user) {
        this.user = user;
        notifyChange();
    }

    public String getName() {
        return user.getName();
    }

    public String getPomodoroStatus() {
        if (user.isInPomodoro()) {
            return "Currently in pomodoro";
        }
        return "On a break";
    }
}
