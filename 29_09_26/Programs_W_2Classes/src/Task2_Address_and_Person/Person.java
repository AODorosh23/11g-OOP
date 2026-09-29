package Task2_Address_and_Person;

public class Person {
    String name;
    int age;
    Address address;

    Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age );
        address.showAddress();
    }
}
