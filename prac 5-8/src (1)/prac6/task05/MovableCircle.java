package prac6.task05;

import prac5.task02.Circle;


import java.awt.*;

public class MovableCircle extends Circle implements Movable {
    private MovablePoint center;

    public MovableCircle(int x, int y, Color color, int radius, int xSpeed, int ySpeed) {
        super(x,y, color, radius);
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
