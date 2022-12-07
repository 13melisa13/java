package prac13.task04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите фамилию, имя и отчество человека");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] fio = str.split("\\W");
        Person person;
        switch (fio.length){
            case (2):
                person = new Person(fio[0],fio[1],"");
                break;
            case (3):
                person = new Person(fio[0],fio[1],fio[2]);
                break;
            default:
                person = new Person(fio[0],"","");
                break;
        }
        System.out.println(person.getFIO());
    }
}
