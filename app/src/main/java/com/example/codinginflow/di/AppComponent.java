package com.example.codinginflow.di;

import android.app.Application;

import com.example.codinginflow.BaseApplication;
import com.example.codinginflow.Vasea;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(
        modules = {
                ActivityBuildersModule.class,
                AndroidSupportInjectionModule.class,
                AppModule.class
        })
public interface AppComponent extends AndroidInjector<BaseApplication> {

    Vasea vasea();

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
