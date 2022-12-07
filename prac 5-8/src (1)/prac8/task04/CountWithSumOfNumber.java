package prac8.task04;

import java.util.Scanner;

public class CountWithSumOfNumber {
    public static int count(int k, int sum){
        if (sum == 0)
            return 1;
        if (k == 0)
            return 0;
        int count = 0;
        for (int i = 0; i <= 9; i++)
            if (sum - i >= 0)
                count += count(k - 1, sum - i);
        return count;
    }
    public static int finalCount(int k, int sum){
        if (k == 1 && sum == 0)
            return 1;
        int count = 0;
        for (int i = 1; i <= 9; i++)
            if (sum - i >= 0)
                count += count(k - 1, sum - i);
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число k:");
        int k = in.nextInt();
        System.out.println("Введите число sum:");
        int sum = in.nextInt();
        System.out.println("Количество k-значных числ с суммой цифр sum: " + finalCount(k,sum));
    }
}
