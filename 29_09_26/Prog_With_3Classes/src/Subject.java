public class Subject {
    String name;
    int hours;
    Teacher teacher;

    Subject(String name, int hours,Teacher teacher) {
        this.name = name;
        this.hours = hours;
        this.teacher = teacher;
    }

    void showSubjectInfo() {
        System.out.println("Subject: " + name);
        System.out.println("Hours: " + hours);
        System.out.println("--Teacher info--");
        this.teacher.showTeacherInfo();
    }
}
