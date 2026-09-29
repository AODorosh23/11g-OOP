package Task1_Car_and_Engine;

public class Engine {
    String type;
    int horsepower;

    Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    void showEngineInfo(){
        System.out.println("Engine Type: " + this.type);
        System.out.println("Engine Horsepower: " + this.horsepower);
    }
}

