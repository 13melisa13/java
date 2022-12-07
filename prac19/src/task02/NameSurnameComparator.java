package task02;

import java.util.Comparator;

public class NameSurnameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNameSurname().compareTo(o2.getNameSurname());
    }
}
