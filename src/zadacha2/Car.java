package zadacha2;

import java.util.Scanner;

class Car{

    String brand;
    String model;
    String color;
    int year;
    static void SayHello(Car car){
        System.out.println("Hello! The car you picked is a " + car.color + car.year + car.brand + car.model + " hope you have fun driving it! :)");
    }
    static String CarChoice(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Hello! Would you like to take the Red Honda NSX?(Y/N)");
        String str = scn.nextLine();
        return str;
    }

    public static void main(String[] args){

        Car car = new Car();
        car.brand = " Honda ";
        car.model = "NSX";
        car.color = "Red ";
        car.year = 1998;

        if(CarChoice().equals("Y")) {
            SayHello(car);
        }
        else{
            System.out.println("That's alright. Goodbye, have a nice day!");
        }



    }
}
