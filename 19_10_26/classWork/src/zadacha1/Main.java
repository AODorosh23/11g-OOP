package zadacha1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String num =  scn.nextLine();
        int num1 = Integer.parseInt(num);
        if(num1 <= 0){
            System.out.println("Invalid input");
        }else{
            int hours, minutes;
            hours = num1/60;
            minutes = num1 - (hours * 60);

            System.out.println(hours + " hours " + minutes + " minutes");
        }
    }
}