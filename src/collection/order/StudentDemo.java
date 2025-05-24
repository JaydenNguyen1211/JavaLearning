package collection.order;

import java.util.*;

public class StudentDemo {
    public static void main(String[] args) {
        //Test Comparable
        Student huy = new Student(30, "Huy");
        Student linh = new Student(28, "Linh");
        Student giang = new Student(43, "Giang");
        Student minh = new Student(30,"Minh");
        Student an = new Student(30, "An");
        List<Student> students = new ArrayList<Student>();
        students.add(huy);
        students.add(linh);
        students.add(giang);
        students.add(minh);
        students.add(an);
        Collections.sort(students);
        System.out.println("Start test Comparable");
        for (Student student : students) {
            System.out.print(student);
        }
        System.out.println("");
        //Test Comparator
        System.out.println("Start test Comparator");
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Student student : students) {
            System.out.print(student);
        }
    }
}
