package ListsSets;

import java.util.ArrayList;
import java.util.List;

public class JavaList {


    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Student student1 = new Student();
        Student student2 = new Student();
    students.add (student1);

    student1.setVorname("tom");
    student1.setNachname("erster");
    student1.setMatrikelnummer(123456);

student2.setVorname("Tim");
student2.setNachname("zweiter");
student2.setMatrikelnummer(654321);

        System.out.println(student1);
    }

}
