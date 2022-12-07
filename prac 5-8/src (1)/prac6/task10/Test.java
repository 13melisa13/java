package prac6.task10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество разлизных ПК");
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            Computer computer = new Computer();
            computer.fill();
            shop.add(computer);
        }
        shop.print();

        System.out.println("Введите ПК для удаления");
        Computer computer1 = new Computer();
        computer1.fill();

        shop.remove(computer1);
        shop.print();

    }
}
