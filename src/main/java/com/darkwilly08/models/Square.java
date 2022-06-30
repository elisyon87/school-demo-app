package com.darkwilly08.models;

public class Square extends Figura {

    float sideLength;

    public Square() {
        super("cuadrado");
    }

    public void setSideLenght(float length) {
        this.sideLength = length;
    }

    @Override
    public String getShape() {
        return shape;
    }

    @Override
    public float getPerimeter() {
        return (float) Math.pow(sideLength, 2);
    }

    @Override
    public float getArea() {
        return sideLength * 4;
    }

}
