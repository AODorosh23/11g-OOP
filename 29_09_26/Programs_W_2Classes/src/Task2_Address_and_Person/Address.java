package Task2_Address_and_Person;

public class Address {
    String city;
    String street;
    int number;

    Address(String city, String street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    void showAddress() {
        String nl = System.getProperty("line.separator");
        System.out.println("City: " +city + nl + "Street: " + street + nl +"Number: "+ number);
    }
}
