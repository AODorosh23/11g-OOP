package zadacha6;

import java.util.Scanner;

public class main {
    static double average(double[] values){
        double sum = 0;
        for(int i = 0; i < 5; i++){
            sum += values[i];
        }
        return sum/5;
    }
    static double max(double[] values){
        double max = values[0];
        for(int i = 1; i < 5; i++){
            if(values[i] > max){
                max = values[i];
            }
        }
        return max;
    }
    static int countAbove(double[] values, double limit){
        int count = 0;
        for(int i = 0; i < 5; i++){
            if(values[i] > limit){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        double[] sound = new double[5];
        for(int i = 0; i < 5; i ++){
            sound[i] = Double.parseDouble(scn.nextLine());
        }
        System.out.println(average(sound));
        System.out.println(max(sound));
        System.out.println(countAbove(sound, 85));
    }
}
