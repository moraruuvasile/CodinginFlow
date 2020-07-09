package com.example.codinginflow.di.main;

import com.example.codinginflow.ui.main.posts.PostsFragment;
import com.example.codinginflow.ui.main.profile.ProfileFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();

    @ContributesAndroidInjector
    abstract PostsFragment constributePostsFragment();
}