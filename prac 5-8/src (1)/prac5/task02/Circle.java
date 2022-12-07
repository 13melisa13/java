package prac5.task02;

import java.awt.*;

public class Circle extends Shape{
    protected int radius;

    public Circle(int x, int y, Color color, int radius){
        super(x,y,color);
        this.radius = radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
