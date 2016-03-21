package br.com.lucasalbuquerque.mvvmsample.di.component;

import android.content.Context;

import javax.inject.Singleton;

import br.com.lucasalbuquerque.mvvmsample.di.module.ApplicationModule;
import br.com.lucasalbuquerque.mvvmsample.model.UserFavor;
import br.com.lucasalbuquerque.mvvmsample.view.UserActivity;
import dagger.Component;

@Singleton
@Component(modules={ApplicationModule.class})
public interface ApplicationComponent {
    void inject(UserActivity userActivity);

    Context context();
    UserFavor user();
}