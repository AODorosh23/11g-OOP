package zadacha2;

public class Student {
    String name;
    static String school = "IB school";
    Student(String name){
        this.name = name;
    }
    void showInfo(){
        System.out.println(name);
        System.out.println(school);
    }

}
