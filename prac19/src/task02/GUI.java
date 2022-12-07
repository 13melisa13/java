package task02;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class GUI extends JFrame {
    JTable table;

    GUI(Model model){
        super("Students");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 300));
        setLocationRelativeTo(null);
        // Button
        JPanel pN = new JPanel(new FlowLayout());
        pN.setPreferredSize(new Dimension(300, 50));
        JButton searchStudent = new JButton("Search student");
        JButton addStudent = new JButton("Add student");
        JButton removeStudent = new JButton("Remove student");
        pN.add(searchStudent);
        pN.add(addStudent);
        pN.add(removeStudent);
        searchStudent.addActionListener(e-> searchStudentButton(model.getArray()));
        addStudent.addActionListener(e-> addStudentButton(model.getArray()));
        removeStudent.addActionListener(e-> removeStudentButton(model.getArray()));
        // JTable
        Object[] headers = new String[] {"Name Surname", "Course", "GPA"};
        Object [][] startStudents = new String[model.getArray().size()][3];
        for(int i = 0; i < model.getArray().size(); i++){
            startStudents[i][0] = model.getArray().get(i).getNameSurname();
            startStudents[i][1] = model.getArray().get(i).getCourse().toString();
            startStudents[i][2] = model.getArray().get(i).getGPA().toString();
        }
        table = new JTable( new DefaultTableModel(startStudents, headers)){
            @Override
            public boolean isCellEditable(int x, int y){return false;}
        };
        JTableHeader header = table.getTableHeader();
        header.setReorderingAllowed(false);
        header.setResizingAllowed(false);
        header.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Driver driver = new Driver();
                int count = e.getClickCount();
                if (count == 2){
                    if(header.getHeaderRect(0).contains(e.getX(), e.getY()))
                        driver.insertionSort(new NameSurnameComparator(),model.getArray());
                    if(header.getHeaderRect(1).contains(e.getX(), e.getY()))
                        driver.insertionSort(new CourseComparator(),model.getArray());
                    if(header.getHeaderRect(2).contains(e.getX(), e.getY()))
                        driver.insertionSort(new GpaComparator(),model.getArray());
                    update(model.getArray());
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        // Adding comps
        getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
        getContentPane().add(pN, BorderLayout.NORTH);
        pack();
        setVisible(true);
    }
    void searchStudentButton(ArrayList<Student>arrayList){
        Driver driver = new Driver();
        String s = JOptionPane.showInputDialog("Enter Name Surname");
        try {
            JOptionPane.showMessageDialog(this,
                    "Found: " + driver.searchStudent(s,arrayList));
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    void removeStudentButton(ArrayList<Student>arrayList){
        Driver driver = new Driver();
        String s = JOptionPane.showInputDialog("Enter Name Surname");
        try {
            driver.removeStudent(s, arrayList);
            update(arrayList);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    void addStudentButton(ArrayList<Student>arrayList) {
        Driver driver = new Driver();
        String nameSurname = JOptionPane.showInputDialog("Enter Name Surname");
        try {
            if (nameSurname == null || nameSurname.isEmpty()) throw new EmptyStringException();
            Student student = new Student(nameSurname);
            String course = JOptionPane.showInputDialog("Enter Course");
            if (course == null || course.isEmpty()) throw new EmptyStringException();
            student.setCourse(Integer.parseInt(course));
            String gpa = JOptionPane.showInputDialog("Enter GPA");
            if (gpa == null || gpa.isEmpty()) throw new EmptyStringException();
            student.setGPA(Integer.parseInt(gpa));
            driver.addStudent(student, arrayList);
            update(arrayList);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bad format for number");
        }

    }
    void update(ArrayList<Student> arrayList){
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        int count = table.getRowCount();
        for (int i = 0; i < count; i++) {
            dtm.removeRow(0);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Student st = arrayList.get(i);
            dtm.insertRow(i, new Object[]{st.getNameSurname(), st.getCourse(), st.getGPA()});
        }
    }
}
