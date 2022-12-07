package prac6.task01_02;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int x1Speed, int y1Speed, int x2Speed, int y2Speed) {
        topLeft = new MovablePoint(x1, y1, x1Speed, y1Speed);
        bottomRight = new MovablePoint(x2, y2, x2Speed, y2Speed);
    }

    public void setSpeed(int xSpeed, int ySpeed){
        topLeft.ySpeed = bottomRight.ySpeed =ySpeed;
        topLeft.xSpeed = bottomRight.xSpeed = xSpeed;
    }

    private boolean isEqualSpeed(){
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=MovablePoint{x=" + topLeft.x + ", y="+ topLeft.y+
                "}, bottomRight=MovablePoint{x=" + bottomRight.x + ", y=" + bottomRight.y +
                "}, xSpeed = " + topLeft.xSpeed +
                ", ySpeed=" + topLeft.ySpeed +
                "}";
    }

    @Override
    public void moveUp() {
        if(!isEqualSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                "topLeft:\n\txSpeed = " + topLeft.xSpeed + "\n\tySpeed = " + topLeft.ySpeed +
                "\nbottomRight:\n\txSpeed = " + bottomRight.xSpeed + "\n\tySpeed = " + bottomRight.ySpeed);
        topLeft.moveUp();
        bottomRight.moveUp();

    }

    @Override
    public void moveDown() {
        if(!isEqualSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                "topLeft:\n\txSpeed = " + topLeft.xSpeed + "\n\tySpeed = " + topLeft.ySpeed +
                "\nbottomRight:\n\txSpeed = " + bottomRight.xSpeed + "\n\tySpeed = " + bottomRight.ySpeed);
        topLeft.moveDown();
        bottomRight.moveDown();

    }

    @Override
    public void moveLeft() {
        if(!isEqualSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                "topLeft:\n\txSpeed = " + topLeft.xSpeed + "\n\tySpeed = " + topLeft.ySpeed +
                "\nbottomRight:\n\txSpeed = " + bottomRight.xSpeed + "\n\tySpeed = " + bottomRight.ySpeed);
        topLeft.moveLeft();
        bottomRight.moveLeft();

    }

    @Override
    public void moveRight() {
        if(!isEqualSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                "topLeft:\n\txSpeed = " + topLeft.xSpeed + "\n\tySpeed = " + topLeft.ySpeed +
                "\nbottomRight:\n\txSpeed = " + bottomRight.xSpeed + "\n\tySpeed = " + bottomRight.ySpeed);
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
