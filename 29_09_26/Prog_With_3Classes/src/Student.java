public class Student {
    String name;
    int age;
    Subject subject;

    Student(String name, int age, Subject subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    void showStudentInfo() {
        System.out.println("| Student info |" );
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("- Subject info -");
        subject.showSubjectInfo();
    }
}
