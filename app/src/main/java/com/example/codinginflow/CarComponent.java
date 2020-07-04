package com.example.codinginflow;

import com.example.codinginflow.library.WeelsModule;

import dagger.Component;

@Component (modules = WeelsModule.class)
interface CarComponent {

    Car getCar();

    void injectt(MainActivity mainActivity);
}
