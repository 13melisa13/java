package prac6.task06_07_08_09;

import java.util.ArrayList;

public class Book implements Printable {
    String title;
    String author;
    int year;
    public Book (String title, String author, int year) {
        setAuthor(author);
        setTitle(title);
        setYear(year);
    }
    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
    public static void printBook(ArrayList<Printable> printables){
        for (Printable printable: printables) {
            if (printable instanceof Book){
                printable.print();
            }
        }
    }
    @Override
    public void print() {
        System.out.println(title);
    }
}

