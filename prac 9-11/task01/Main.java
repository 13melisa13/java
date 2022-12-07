package task01;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main implements Comparator<Student> {

    static ArrayList<Student>students1 = new ArrayList<>();

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare( o2.getGPA(),o1.getGPA());
    }
    static public void setArray(ArrayList<Student> students,int count, int f){
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < count; i++) {
            System.out.println("Введите id студента");
            Student student = new Student();
            student.setFormat(f);
            int id = in.nextInt();
            student.setIdNumber(id);
            System.out.println("Введите группу");
            in.nextLine();
            String group = in.nextLine();
            student.setSurname(group);
            System.out.println("Введите итоговые баллы");
            int gpa = in.nextInt();
            student.setGPA(gpa);
            System.out.println("Введите дату рождения \"yyyy.MM.dd\":");
            in.nextLine();
            String dateString = in.nextLine();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
            try {
                Date date = formatter.parse(dateString);
                student.setDateOfBirthday(date);
            } catch (ParseException e){
                e.printStackTrace();
            }
            students.add(student);
        }
    }
    static public void outArray(ArrayList<Student>students0){
        for (Student student: students0) {
            System.out.println(student);
        }
    }
    static public void insertionSort (ArrayList<Student> students){
        int j;
        Student key;
        for (int i = 1; i < students.size(); i++){
            j = i - 1;
            key = students.get(i);
            while (j >= 0 && students.get(j).compareTo(key) > 0){
                students.set(j+1, students.get(j));
                j -= 1;
            }
            students.set(j + 1, key);
        }
    }

   static public int partition(ArrayList<Student> students, int left, int right, Comparator<Student> comparator){
        int marker = left;
        for ( int i = left; i <= right; i++ )
        {
            if ( comparator.compare(students.get(i), students.get(right)) <= 0)
            {
                Student temp = students.get(marker);
                students.set(marker,students.get(i));
                students.set(i,temp);
                marker += 1;
            }
        }
        return marker - 1;
    }
    static public void quickSort (ArrayList<Student> students, int left, int right, Comparator<Student> comparator)
    {
        if ( left >= right ) return;
        int pivot = partition (students, left, right, comparator);
        quickSort (students, left, pivot-1, comparator);
        quickSort (students,  pivot+1, right, comparator);
    }

    static public void merge(ArrayList<Student> students, int l, int m, int r,Comparator<Student> comparator) {
        int n1 = m - l + 1;
        int n2 = r - m;
        ArrayList<Student> L = new ArrayList<>(n1);
        ArrayList<Student> R = new ArrayList<>(n2);

        for (int i = 0; i < n1; ++i)
            L.add(students.get(l + i));
        for (int j = 0; j < n2; ++j)
            R.add(students.get(m + 1 + j));
        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (comparator.compare(L.get(i), R.get(j)) <= 0) {
                students.set(k, L.get(i));
                i++;
            }
            else {
                students.set(k, R.get(j));
                j++;
            }
            k++;
        }
        while (i < n1) {
            students.set(k, L.get(i));
            i++;
            k++;
        }
        while (j < n2) {
            students.set(k, R.get(j));
            j++;
            k++;
        }
    }

    static public void sortMerge(ArrayList<Student> students, int left, int right, Comparator<Student> comparator)
    {
        if (left < right) {
            int middle = left + (right - left) / 2;
            sortMerge(students, left, middle,comparator);
            sortMerge(students, middle + 1, right,comparator);
            merge(students, left, middle, right,comparator);
        }
    }
    static public ArrayList<Student> twoListToOne(ArrayList<Student> l1, ArrayList<Student>l2, Comparator<Student> comparator){
        ArrayList<Student> list = new ArrayList<>(l1.size()+ l2.size());
        list.addAll(l1);
        list.addAll(l2);
        sortMerge(list, 0, list.size()-1, comparator);
        return list;
    }
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Введите номер формата: 1 - длинный, 0 - средний, -1 - короткий");
        int f = in.nextInt();
        System.out.println("Введите количество студентов:");
        int count = in.nextInt();
        ArrayList<Student>studentsFirst = new ArrayList<>();
        setArray(studentsFirst, count,f);
        outArray(studentsFirst);

        System.out.println("Сортировка по id вставками:");
        insertionSort(studentsFirst);
        outArray(studentsFirst);

        System.out.println("Сортировка по баллам слиянием:");
        sortMerge(studentsFirst,0,studentsFirst.size()-1, new Main());
        outArray(studentsFirst);

        System.out.println("Введите номер формата: 1 - длинный, 0 - средний, -1 - короткий");
        f = in.nextInt();
        System.out.println("Введите количество студентов:");
        count = in.nextInt();
        setArray(students1, count, f);
        outArray(students1);

        System.out.println("Сортировка по баллам быстрой:");
        quickSort(students1, 0, students1.size()-1, new Main());
        outArray(students1);

        System.out.println("Слияние двух несорт списков в один сортировка по баллам слиянием:");
        ArrayList<Student> studentsResult = twoListToOne(studentsFirst, students1, new Main());
        outArray(studentsResult);

        ArrayList<Student> arrayList = new ArrayList<>(studentsFirst);
        LinkedList<Student> linkedList = new LinkedList<>(studentsFirst);
        Student s = new Student();
        s.setIdNumber(1);

        long startTime = System.currentTimeMillis();
        arrayList.add(s);
        System.out.println("arrayList add "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        linkedList.add(s);
        System.out.println("linkedList add "+(System.currentTimeMillis()-startTime));

        startTime = System.currentTimeMillis();
        arrayList.indexOf(s);
        System.out.println("arrayList indexOf "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        linkedList.indexOf(s);
        System.out.println("linkedList indexOf "+(System.currentTimeMillis()-startTime));

        startTime = System.currentTimeMillis();
        arrayList.remove(s);
        System.out.println("arrayList remove "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        linkedList.remove(s);
        System.out.println("linkedList remove "+(System.currentTimeMillis()-startTime));

        startTime = System.currentTimeMillis();
        arrayList.add(0,s);
        System.out.println("arrayList insert "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        linkedList.add(0,s);
        System.out.println("linkedList insert "+(System.currentTimeMillis()-startTime));
    }
}
