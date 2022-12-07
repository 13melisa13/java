package lab;
import java.util.Scanner;
public class Class2 {
    public static void main (String[] args){
        Class1 author = new Class1 ("Достоевский Федор Михайлович", "dostoevskiy@ya.ru",'f');
        System.out.println("Имя автора: " + author.getName());
        System.out.println(author.toString());
        Scanner in = new Scanner(System.in);
        System.out.println("Введите email автора:" );
        String email = in.nextLine();
        author.setEmail(email);
        System.out.println(author.toString());


    }
}
