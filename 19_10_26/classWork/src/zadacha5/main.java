package zadacha5;

import java.util.Scanner;

public class main {
    static boolean checkPin(int ePin, int cPin){
        return ePin == cPin;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tries = 0;
        int corrPin = 1234;

        for(int i = 0; i < 3; i++){
            int pin = Integer.parseInt(scn.nextLine());
            tries++;
            if(checkPin(pin, corrPin)){
                System.out.println("Unlocked");
                break;
            }else{
                if(tries == 3)  {
                System.out.println("Locked");
                break;
            }
                System.out.println("Try again");

            }

        }

    }
}
