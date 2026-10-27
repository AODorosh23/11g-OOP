package zadacha8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("Paris-Frankfurt","1");
        map.put("Paris-Berlin","6");
        map.put("Paris-Sofia","8");
        map.put("Paris-London","4");
        map.put("Paris-Athens","11");

        Scanner scn = new Scanner(System.in);
        String flight = scn.nextLine();
        boolean flag = false;
        for(Map.Entry mapElement:map.entrySet()){
            if(mapElement.getValue().equals(flight))
            {
               flag = true;
               System.out.println("The exit gate for that flight is :" + mapElement.getValue());
               break;
            }
        }
        if(flag==false)
        {
            System.out.println("Invalid flight information");
        }




    }
}
