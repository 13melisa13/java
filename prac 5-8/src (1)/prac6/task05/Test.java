package prac6.task05;


import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Movable m = new MovablePoint(0, 0, 1, 4);
        System.out.println("Point: ");
        System.out.println(m);
        m.moveUp();
        m.moveRight();
        System.out.println("Up+Right: " + m);

        System.out.println("Circle: ");
        m = new MovableCircle(0, 0, new Color(10) ,2, 4, 6);
        System.out.println(m);
        m.moveDown();
        m.moveLeft();
        System.out.println("Down+Left: " + m);


    }
}
