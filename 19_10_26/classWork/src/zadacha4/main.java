package zadacha4;

import java.util.Scanner;

public class main {
    static double calculateFuel(double distance, double consumption){
        return (distance/100 * consumption);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double distance = Double.parseDouble(scn.nextLine());
        double consumption = Double.parseDouble(scn.nextLine());

        double fuel = calculateFuel(distance, consumption);
        double finalFuel = fuel + (fuel*0.1);
        System.out.println("Fuel with reserve:" + finalFuel);
    }
}
