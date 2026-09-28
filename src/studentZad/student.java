package studentZad;

import java.util.Scanner;

public class student {
    String fName;
    String lName;
    int age;
    int year;




    static void input(student st){
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to the gymnasium! Please enter your first name: ");
       student st1 = new student();
       st1.fName = scn.nextLine();
       System.out.println("Now your last name: ");
       st1.lName = scn.nextLine();
       System.out.println("Now your age: ");
       st1.age = scn.nextInt();
       System.out.println("And lastly your attending year: ");
       st1.year = scn.nextInt();

    }
    static void output(student st)
    {
        String nl = System.lineSeparator();
        System.out.println("Nice to meet you "+ st.fName + " " + st.lName + " " + nl + "Your classmates are waiting for you on the 2nd floor, enjoy your " + st.year + " year!");
    }

    public static void main(String[] args){
        student st = new student();
        input(st);
        output(st);
    }
}
