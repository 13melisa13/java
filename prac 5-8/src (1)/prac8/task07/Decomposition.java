package prac8.task07;

import java.util.Scanner;

public class Decomposition {
    public static boolean isSimple(int number) { return isSimple(number, 2); }
    public static boolean isSimple(int number, int div){
        if (number == 2) return true;
        if(number % div == 0) return false;
        if(div > Math.sqrt(number)) return true;
        return isSimple(number, div+1);
    }
    public static void decomposition(int number) { decomposition(number, 2); }
    public static void decomposition(int number, int div){
        if (number == 2) {
            System.out.print(number);
            return;
        }
        if(number < 2) return;
        if(!isSimple(div)) {
            decomposition(number, div+1);
            return;
        }
        if(number % div == 0){
            System.out.print(div +" ");
            decomposition(number / div, div);
        }else decomposition(number, div+1);
    }
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        decomposition(number);

    }
}
