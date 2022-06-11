package com.darkwilly08.models;

public abstract class Figura {
    String shape;
    String color;
    int sidesCount;

    public Figura(String shape) {
        this.shape = shape;
    }

    public void setColor(String rgb) {
        this.color = rgb;
    }

    public void setSides(int sides) {
        this.sidesCount = sides;
    }

    public String getShape() {
        return shape;
    }

    public abstract float getArea();

    public abstract float getPerimeter();

}
