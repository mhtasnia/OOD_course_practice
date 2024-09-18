package com.prblm4;

public class Main {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        Lion l = new Lion();
        Deer d = new Deer();

        t.eat();
        t.sleep();
        l.eat();
        l.sleep();
        d.eat();
        d.sleep();
    }
}
