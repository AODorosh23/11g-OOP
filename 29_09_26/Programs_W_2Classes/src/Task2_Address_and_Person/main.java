package Task2_Address_and_Person;

public class main {
    public static void main(String[] args) {
        Address adr = new Address("Burgas","Aleksandrovska",10);
        Person per1 = new Person("Maria", 25, adr);

        per1.showInfo();
    }
}
