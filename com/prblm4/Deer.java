package com.prblm4;

public class Deer extends Animal{
    

    @Override
    public void eat() {
        System.out.println("Deer eats Grass");
    }

    @Override
    public void sleep() {
        System.out.println("Deer sleeps in open field");
    }
    
}
