public class Car{
    private String model;
    private String brand;
    private int year;

     Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public static void main(String  [] args) {
        Car car = new Car("Accord","Honda",2006);
        System.out.println(car.model + " " + car.brand + " " + car.year);
    }

}
