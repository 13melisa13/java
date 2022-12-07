package prac13.task05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Address> addresses = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.println("Введите адрес:");
            Address newAddress = new Address(in.nextLine());
            addresses.add(newAddress);
        }
        for (Address address:addresses) {
            System.out.println(address);
        }
    }
}
