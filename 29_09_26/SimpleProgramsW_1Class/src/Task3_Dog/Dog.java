package Task3_Dog;

public class Dog{

    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void showInfo() {
        System.out.println("Dog's Name: " + name + "'s Age: " + age);
    }
    void bark(){
        System.out.println(name + " says..");
        for(int i =1; i < 3; i++) {
            System.out.println("Bark!");
        }
    }

}

