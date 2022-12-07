package prac6.task10;

import java.util.Scanner;

public class Monitor implements Fillable{
    String name;
    int size;
    public Monitor(){}
    public Monitor(String name, int size){
        this.size = size;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }
    @Override
    public void fill() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название монитора:");
        this.name = in.nextLine();
        System.out.println("Введите размер монитора:");
        this.size = in.nextInt();

    }
    @Override
    public String toString() {
        return "Monitor{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
