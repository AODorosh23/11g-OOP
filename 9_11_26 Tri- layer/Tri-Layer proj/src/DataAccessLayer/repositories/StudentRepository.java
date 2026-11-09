package DataAccessLayer.repositories;

import DataAccessLayer.models.Student;

import java.util.ArrayList;

public class StudentRepository {
    public static ArrayList<Student> students = new ArrayList<>();

    void logStudent(String name,String surname, int age){
        Student st = new Student();
        st.setStudent(name,surname,age);
    }
}
