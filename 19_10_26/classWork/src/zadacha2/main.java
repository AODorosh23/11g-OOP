package zadacha2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num = Double.parseDouble(sc.nextLine());
        if(num < 0){
            System.out.println("Invalid measurement");
        }else if(num <= 25){
            System.out.println("Good");
        }else if(num <= 50){
            System.out.println("Moderate");
        }else{
            System.out.println("High pollution");
        }
    }
}
