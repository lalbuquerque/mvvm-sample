package br.com.lucasalbuquerque.mvvmsample.di.module;

import android.app.Application;
import android.content.Context;

import com.cocosw.favor.FavorAdapter;

import javax.inject.Singleton;

import br.com.lucasalbuquerque.domain.repository.ContactRepository;
import br.com.lucasalbuquerque.domain.repository.MockContactRepository;
import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Context providesContext() {
        return mApplication;
    }

    @Provides
    ContactRepository providesContactRepository(MockContactRepository contactRepository) {
        return contactRepository;
    }
}