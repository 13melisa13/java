package prac13.task04;

public class Person {
    String surname;
    String name;
    String nameOfFather;
    Person(String surname, String name, String nameOfFather){
        this.surname = surname;
        this.name = name;
        this.nameOfFather = nameOfFather;
    }
    String getFIO(){
        String fio = surname;
        if (!name.isEmpty()){
            fio += " "+ name.charAt(0) + ".";
            if (!nameOfFather.isEmpty())
                fio += nameOfFather.charAt(0) + ".";
        }
        return fio;
    }
}
