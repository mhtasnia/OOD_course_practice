package com.prblm6;

public class Main {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        LazyPerson lazyPerson = new LazyPerson();

        athlete.eat();
        athlete.exercise();

        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
