package com.prblm5;

public class Cube extends Shape3D {

    private double length;

    public Cube(double length){
        this.length = length;
    }
    
    public double calculateVolume(){
        return Math.pow(length, 3);
    }
    public double calculateSurfaceArea(){
        return 6 * Math.pow(length, 2);
    }

    public double getLength() {
        return length;
    }
}
