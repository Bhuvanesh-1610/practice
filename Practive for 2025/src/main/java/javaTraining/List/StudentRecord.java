package javaTraining.List;


import java.util.ArrayList;
import java.util.List;

public class StudentRecord {
    public static void main(String[] args) {

        Student stud = new Student();
        Student student = new Student(1,"raja",28);
        Student student2 = new Student(2,"raja",29);
        Student student3 = new Student(3,"raja",30);
        Student student4 = new Student(4,"raja",31);

        List<Student> students = new ArrayList<Student>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(student3.getAge());

        for (Student s : students) {
            System.out.println(s);
        }
        stud.setAge(3);
        System.out.println(stud.getAge());

    }
}
