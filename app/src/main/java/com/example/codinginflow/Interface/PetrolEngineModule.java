package com.example.codinginflow.Interface;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
   abstract Engine2 provideEngine(Petrol petrol);
}
