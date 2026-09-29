package Task4_Car;

public class main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red", 2024);
        Car car2 = new Car("BMW", "Black", 2022);

        car1.showCar();
        car1.drive();
        car2.showCar();
        car2.drive();
    }
}
