package zadacha3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = Integer.parseInt(scn.nextLine());
        boolean validity = Boolean.parseBoolean(scn.nextLine());
        if (validity&& age >= 16) {
            System.out.println("Access granted");
        }else{
            System.out.println("Access denied");
        }

    }
}
