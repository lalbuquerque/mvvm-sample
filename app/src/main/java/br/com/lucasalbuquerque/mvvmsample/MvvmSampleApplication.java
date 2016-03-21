package br.com.lucasalbuquerque.mvvmsample;

import android.app.Application;

import br.com.lucasalbuquerque.mvvmsample.di.component.ApplicationComponent;
import br.com.lucasalbuquerque.mvvmsample.di.component.DaggerApplicationComponent;
import br.com.lucasalbuquerque.mvvmsample.di.module.ApplicationModule;

public class MvvmSampleApplication extends Application {
    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
