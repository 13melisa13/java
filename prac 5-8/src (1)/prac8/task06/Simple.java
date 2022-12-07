package prac8.task06;

import java.util.Scanner;

public class Simple {
    public static void isSimple(int number) { isSimple(number, 2); }
    public static void isSimple(int number, int div){
        if (number == 2) {
            System.out.println("YES");
            return;
        }
        if(number % div == 0) {
            System.out.println("NO");
            return;
        }
        if(div > Math.sqrt(number)){
            System.out.println("YES");
            return;
        }
        isSimple(number, div+1);
    }

    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        isSimple(number);
    }
}
