package classassignments;

import java.util.ArrayList;
import java.util.List;

public class SampleCollection {
    public static void main(String[] args) {
       /* Student[] students = new Student[2];
        students[0] = new Student("sonal","001");
        students[1] = new Student("rahul","002");*/
        List<Student> students = new ArrayList<>();

        students.add(new Student("sonal", "001"));
        students.add( new Student("rahul","002"));

        for(int i=0;i<students.size();i++){
            System.out.println("Index : " + i + ":" + students.get(i).name);
            System.out.println("Index : " + i + ":" + students.get(i).rollNumber);
        }
    }
}
