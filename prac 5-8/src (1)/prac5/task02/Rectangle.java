package prac5.task02;

import java.awt.*;

public class Rectangle extends Shape{
    protected int height;
    protected int width;

    public Rectangle(int x, int y, Color color, int width, int height){
        super(x, y, color);
        this.height=height;
        this.width=width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
