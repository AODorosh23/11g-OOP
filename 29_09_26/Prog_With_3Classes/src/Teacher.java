public class Teacher {

    String name;
    int experience;

    Teacher(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }
    void showTeacherInfo() {
        System.out.println("Teacher: " + name);
        System.out.println("Experience: " + experience);
    }
}
