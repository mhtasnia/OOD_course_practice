package com.prblm5;

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(4.0);
        System.out.println("radius: " + sphere.getRadius() + "\nSurface Area: " + sphere.calculateSurfaceArea() + "\nVolume:  " + sphere.calculateVolume());

        Cube cube = new Cube(5.0);
        System.out.println("length: " + cube.getLength() + "\nSurface Area: " + cube.calculateSurfaceArea() + "\nVolume:  " + cube.calculateVolume());
    } 
}
