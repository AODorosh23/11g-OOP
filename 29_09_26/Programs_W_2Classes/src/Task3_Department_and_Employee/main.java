package Task3_Department_and_Employee;

public class main {
    public static void main(String[] args) {
        Department dep = new Department("IT","Burgas");
        Employee emp1 = new Employee("Ivan",2500,dep);

        emp1.showInfo();

    }
}
