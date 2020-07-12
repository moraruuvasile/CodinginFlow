package com.example.codinginflow.di;

import com.example.codinginflow.di.auth.AuthModule;
import com.example.codinginflow.di.auth.AuthScope;
import com.example.codinginflow.di.auth.AuthViewModelsModule;
import com.example.codinginflow.di.main.MainFragmentBuildersModule;
import com.example.codinginflow.di.main.MainModule;
import com.example.codinginflow.di.main.MainScope;
import com.example.codinginflow.di.main.MainViewModelsModule;
import com.example.codinginflow.ui.auth.AuthActivity;
import com.example.codinginflow.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

    @MainScope
    @ContributesAndroidInjector(
            modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();

}
