package Task1_Car_and_Engine;

public class Car {
    String brand;
    String model;
    Engine engine;

    Car(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    void showCarInfo(){
        System.out.println("-Car info -");
        System.out.println("Car type(Brand and model): " + this.brand +" " + this.model);
        System.out.println("-- Engine information -- ");
        this.engine.showEngineInfo();
        System.out.println();
    }

}
