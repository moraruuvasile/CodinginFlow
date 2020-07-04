package com.example.codinginflow;

import dagger.Component;

@Component
interface CarComponent {

    Car getCar();

    void injectt(MainActivity mainActivity);
}
