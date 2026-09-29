package Task5_Student;

public class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    void introduce(){
        System.out.println("Let me introduce myself. My name is " + name
                + " and I am " + age + " years old and my average grade is " + grade);
    }
}
