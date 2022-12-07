package prac6.task10;

import java.util.Scanner;

public class Memory implements Fillable{
    int RAM;
    int ROM;
    public Memory(){}
    public Memory (int RAM, int ROM){
        this.RAM = RAM;
        this.ROM = ROM;
    }

    public int getRAM() {
        return RAM;
    }

    public int getROM() {
        return ROM;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "RAM=" + RAM +
                ", ROM=" + ROM +
                '}';
    }
    @Override
    public void fill() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ОЗУ:");
        this.RAM = in.nextInt();
        System.out.println("Введите ПЗУ:");
        this.ROM = in.nextInt();
    }
}
