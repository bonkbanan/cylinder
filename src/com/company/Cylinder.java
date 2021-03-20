package com.company;/*
@USER: dench
@DATE: 20.03.21
@NAME: Cylinder
@TIME: 12:20
*/

public class Cylinder {
    private int radius;
    private int heigh;

    public Cylinder() {
    }

    public Cylinder(int radius, int heigh) {
        this.radius = radius;
        this.heigh = heigh;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", heigh=" + heigh +
                '}';
    }

    public double getSideArea(){
        return 2 * Math.PI * this.getRadius() * this.getHeigh();
    }

    public double getArea(){
        return 2 * this.getBaseArea() + this.getSideArea();
    }
    public double getBaseArea(){
        return Math.PI * Math.pow(this.getRadius(), 2);
    }
}
