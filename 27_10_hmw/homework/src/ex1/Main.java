package ex1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        Set set = new HashSet();

        for(int i = 0; i < num; i++){
            String name = scn.next();
            int age = scn.nextInt();
            Person p = new Person(name, age);
            set.add(p);
        }

    }
}