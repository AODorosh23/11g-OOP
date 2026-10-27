package zadacha7;


import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = Integer.parseInt(scn.nextLine());
        int dCount = 0;
        int uCount = 0;
        boolean javaFlag = false;
        Set<String> s = new HashSet<String>();

        for (int i = 0; i < N; i++) {
            if (s.add(scn.nextLine())){
                uCount++;
            }else{
                dCount++;
            }
        }
        for (String value : s){
            if(value.equals("java")){
                javaFlag = true;
            }
        }
        System.out.println(s);
        System.out.println(uCount);
        System.out.println(dCount);
        System.out.println(javaFlag);
    }
}
