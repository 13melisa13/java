package prac8.task05;

import java.util.Scanner;

public class SumOfNumb {
    public static int sumOfNumber(int number){
        if (number > 0)
            return sumOfNumber(number/10) + number%10;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("Сумма цифр числа: " + sumOfNumber(number));
    }
}
