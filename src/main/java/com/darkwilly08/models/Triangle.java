package com.darkwilly08.models;

public class Triangle extends Figura {

    private float hipo;
    private float ca;
    private float cb;

    public Triangle(float hipo, float ca, float cb) {
        super("triangulo");
        this.hipo = hipo;
        this.ca = ca;
        this.cb = cb;
    }

    @Override
    public float getArea() {
        return (ca * cb) / 2;
    }

    @Override
    public float getPerimeter() {
        return ca + cb + hipo;
    }

}
