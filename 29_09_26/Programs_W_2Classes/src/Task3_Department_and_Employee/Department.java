package Task3_Department_and_Employee;

public class Department {
    String name;
    String location;

    Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    void showDepartmentInfo() {
        System.out.println(" --Department info--");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println();
    }
}
