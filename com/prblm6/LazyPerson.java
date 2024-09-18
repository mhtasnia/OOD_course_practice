package com.prblm6;

public class LazyPerson extends Person{

    @Override
    public void eat() {
        System.out.println("Eat food taking a lot of time");
    }

    @Override
    public void exercise() {
        System.out.println("Doesn't do any exercise");
    }
    
}
