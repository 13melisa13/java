package prac6.task01_02;

public class Test {
    public static void main(String[] args) {
        Movable m = new MovablePoint(0, 0, 1, 4);
        System.out.println("Point: ");
        System.out.println(m);
        m.moveUp();
        m.moveRight();
        System.out.println("Up+Right: " + m);

        System.out.println("Circle: ");
        m = new MovableCircle(0, 0, 2, 4, 6);
        System.out.println(m);
        m.moveDown();
        m.moveLeft();
        System.out.println("Down+Left: " + m);

        System.out.println("Rectangle:");
        m = new MovableRectangle(0, 0, 4, 4, 2,4, 3, 4);
        System.out.println(m);
        try{
            m.moveRight();
            m.moveDown();
        }catch (IllegalStateException e){
            System.out.println(e);
        }


        System.out.println("Change speed for rectangle:");
        MovableRectangle r = (MovableRectangle)m;
        r.setSpeed(2, 4);
        m.moveRight();
        m.moveDown();
        System.out.println("Right+Down: " + m);
    }
}
