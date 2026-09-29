package Task4_Car;

public class Car {
    String brand;
    String color;
    int year;

    Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }
    void showCar() {
        System.out.println("|-Car info-|");
        System.out.println("Brand: " + this.brand + " | Color: " + this.color + " | Year: " + this.year);
    }

    void drive(){
        System.out.println(brand + " is driving.");
    }

}
