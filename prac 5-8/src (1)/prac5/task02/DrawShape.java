package prac5.task02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class DrawShape extends JPanel {
    ArrayList <Circle> circles = new ArrayList<>();
    ArrayList <Square> squares = new ArrayList<>();
    ArrayList <Rectangle> rectangles = new ArrayList<>();

    public DrawShape(){
        JFrame frame = new JFrame ("Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setSize(1280, 720);
        frame.setVisible(true);
        JButton button = new JButton("Добавить фигуры!");
        button.setSize(200, 30);
        button.setLocation(10,10);
        button.addActionListener(new ActionListener() {
                   public void actionPerformed(ActionEvent e) {
                        addRandomShapes();
                        repaint();
                   }
        });
        this.add(button);
    }

    public void addCircle (Circle newCircle) {
        this.circles.add(newCircle);
    }

    public void addRectangle (Rectangle newRectangle) {
        this.rectangles.add(newRectangle);
    }

    public void addSquare (Square newSquare) {
        this.squares.add(newSquare);
    }

    public void addRandomShapes(){
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int shapeNum = random.nextInt(3);
            if (shapeNum == 0)    // Circle
                this.addCircle(new Circle(random.nextInt(1000), random.nextInt(600),
                        new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)),
                        random.nextInt(200)));

            else if (shapeNum == 1)    // Rectangle
                this.addRectangle(new Rectangle(random.nextInt(1000), random.nextInt(600),
                        new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)),
                         random.nextInt(200), random.nextInt(200)));

            else {   // Square
                int side = random.nextInt(200);
                this.addSquare(new Square(random.nextInt(1000), random.nextInt(600),
                        new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)), side));
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        this.setBackground(Color.WHITE);
        for (Circle circle : circles) {
            g.setColor(circle.getColor());
            g.fillOval(circle.getX(), circle.getY(),  circle.getRadius()/2, circle.getRadius()/2);
        }
        for (Rectangle rectangle : rectangles) {
            g.setColor(rectangle.getColor());
            g.fillRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
        }
        for (Square square : squares) {
            g.setColor(square.getColor());
            g.fillRect(square.getX(), square.getY(),square.getSide(), square.getSide());
        }
    }
}
