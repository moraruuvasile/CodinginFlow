package com.example.codinginflow.di.auth;

import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.example.codinginflow.R;
import com.example.codinginflow.network.auth.AuthApi;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class AuthModule {

    @Provides
    static AuthApi provideAuthApi(Retrofit retrofit){
        return retrofit.create(AuthApi.class);
    }


    @Provides
    static Drawable provideAppDrawable(Application application){
        return ContextCompat.getDrawable(application, R.drawable.logo);
    }

}