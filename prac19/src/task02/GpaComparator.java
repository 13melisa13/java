package task02;
import java.util.*;

public class GpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare( o2.getGPA(),o1.getGPA());
    }

}
