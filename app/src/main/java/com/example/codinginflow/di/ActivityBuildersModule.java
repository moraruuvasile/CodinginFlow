package com.example.codinginflow.di;


import com.example.codinginflow.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(    )
    abstract MainActivity contributeMainActivity();

}
