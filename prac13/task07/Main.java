package prac13.task07;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Phone> phones = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите номер:");
            Phone newPhone = new Phone(in.nextLine());
            phones.add(newPhone);
        }
        for (Phone phone:phones) {
            System.out.println(phone);
        }
    }
}
