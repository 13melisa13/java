package prac5.task02;

import java.awt.*;

public class Square extends Rectangle{
    public Square(int x, int y, Color color, int side){
        super(x,y,color,side,side);
    }
    public int getSide() {
        return height;
    }
    public void setSide(int side) {
        this.height = side;
    }
}
