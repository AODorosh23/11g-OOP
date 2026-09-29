package Task1_Car_and_Engine;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine("Petrol", 150);
        Engine engine2 = new Engine("Gasoline", 250);
        Car car1 = new Car("Toyota","Corolla",engine1);
        Car car2 = new Car("Honda","Accord",engine2);

        car1.showCarInfo();
        car2.showCarInfo();
    }
}


