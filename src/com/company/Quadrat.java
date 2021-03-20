package com.company;/*
@USER: dench
@DATE: 20.03.21
@NAME: Quadrat
@TIME: 12:46
*/

public class Quadrat {
    private int side;

    public Quadrat() {
    }

    public Quadrat(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Quadrat{" +
                "side=" + side +
                '}';
    }

    public int getArea(){
        return this.getSide() * this.getSide();
    }

    public int getPerimetr(){
        return this.getSide()*4;
    }

    public double getDiagonal(){
        return Math.sqrt(2) * this.getSide();
    }
}
