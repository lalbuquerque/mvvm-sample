package br.com.lucasalbuquerque.mvvmsample.viewmodel;

import android.view.View;

import javax.inject.Inject;
import javax.inject.Singleton;

import br.com.lucasalbuquerque.domain.model.User;

@Singleton
public class UserViewModel {
    private User mUser;

    private OnPomodoroEndHandler mOnPomodoroEndHandler;
    private boolean mNotifiyMeEnabled;

    @Inject
    public UserViewModel(User user) {
        mUser = user;
        mNotifiyMeEnabled = false;
    }

    public void addOnPomodoroEndHandler(OnPomodoroEndHandler onPomodoroEndHandler) {
        mOnPomodoroEndHandler = onPomodoroEndHandler;
    }

    public String getName() {
        return mUser.getName();
    }

    public String getPomodoroStatus() {
        if (mUser.isInPomodoro()) {
            return "Currently in pomodoro";
        }
       return "On a break";
    }

    public boolean isNotifiyMeEnabled() {
        return mNotifiyMeEnabled;
    }

    public View.OnClickListener OnNotifyMeClick(){
        return view -> {
            mOnPomodoroEndHandler.notifyMeWhenPomodoroEnds(!mNotifiyMeEnabled);
        };
    }
    public interface OnPomodoroEndHandler {
        void notifyMeWhenPomodoroEnds(boolean notify);
    }
}
