package br.com.lucasalbuquerque.mvvmsample.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import br.com.lucasalbuquerque.domain.model.User;
import br.com.lucasalbuquerque.mvvmsample.MvvmSampleApplication;
import br.com.lucasalbuquerque.mvvmsample.R;
import br.com.lucasalbuquerque.mvvmsample.databinding.ActivityUserBinding;
import br.com.lucasalbuquerque.mvvmsample.viewmodel.UserViewModel;

public class UserActivity extends AppCompatActivity implements UserViewModel.OnPomodoroEndHandler {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initializeInjector();

        User user = (User) getIntent().getSerializableExtra("USER");

        UserViewModel userViewModel = new UserViewModel(user);
        userViewModel.addOnPomodoroEndHandler(this);

        ActivityUserBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_user);
        viewDataBinding.setUser(userViewModel);
    }

    @Override
    public void notifyMeWhenPomodoroEnds(boolean notify) {

    }

    private void initializeInjector() {
        ((MvvmSampleApplication) getApplication()).getApplicationComponent().inject(this);
    }
}
