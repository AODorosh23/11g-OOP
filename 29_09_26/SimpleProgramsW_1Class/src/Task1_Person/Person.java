package Task1_Person;

public class Person {
    private String fName;
    private String lName;
    private int age;

    Person(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;

    }
    void showInfo() {
        String nl = System.getProperty("line.separator");
        System.out.println("Full Name: " + this.fName + " " +this.lName + " " + nl + "Age: " +this.age );
    }
    public static void main(String[] args) {
    }
}
