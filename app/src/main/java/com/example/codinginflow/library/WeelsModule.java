package com.example.codinginflow.library;

import dagger.Module;
import dagger.Provides;

@Module
public class WeelsModule {

    @Provides
    Rims provideRims(){
        return new Rims();
    }

    @Provides
    Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheels provideWheels(Rims rim, Tires tire){
        return new Wheels( rim, tire);
    }
}
