package task02;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;

public class Driver {
    public void insertionSort(Comparator comparator, ArrayList<Student> array) {
        int j;
        Student key;
        for (int i = 1; i < array.size(); i++) {
            j = i - 1;
            key = array.get(i);
            while (j >= 0 && comparator.compare(array.get(j), (key)) > 0) {
                array.set(j + 1, array.get(j));
                j -= 1;
            }
            array.set(j + 1, key);
        }
    }
    public Student searchStudent(String nameSurname,ArrayList<Student> array) throws StudentNotFoundException, EmptyStringException {
        if (nameSurname == null || nameSurname.isEmpty()) throw new EmptyStringException();
        for (Student o : array) {
            if (o.getNameSurname().equals(nameSurname)) {
                return o;
            }
        }
        throw new StudentNotFoundException();
    }
    public Student removeStudent(String nameSurname,ArrayList<Student> array) throws StudentNotFoundException, EmptyStringException {
        if (nameSurname == null || nameSurname.isEmpty()) throw new EmptyStringException();
        for (Student o : array) {
            if (o.getNameSurname().equals(nameSurname)) {
                array.remove(o);
                return o;
            }
        }
        throw new StudentNotFoundException();

    }
    public void addStudent(Student o,ArrayList<Student> array)  {
        array.add(o);
    }
}




