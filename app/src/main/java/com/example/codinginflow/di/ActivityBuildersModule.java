package com.example.codinginflow.di;

import com.example.codinginflow.di.auth.AuthModule;
import com.example.codinginflow.di.auth.AuthViewModelsModule;
import com.example.codinginflow.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
            )
    abstract AuthActivity contributeAuthActivity();

}
