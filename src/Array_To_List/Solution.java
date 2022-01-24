package Array_To_List;

import java.util.ArrayList;
import java.util.Arrays;

/*
    ---> Write a program to convert Array to List?
        Using Arrays.asList() method

 */
public class Solution {
    public static void main(String[] args) {

        // Array Declaration and Initialization
        String cityNames[]={"Houston", "Dallas", "Austin", "Spring"};

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(cityNames));

        arrayList.add("Odessa");
        arrayList.add("ElPaso");

        for(String city:arrayList){
            System.out.println(city);
        }


        arrayList.stream().toList();
    }
}
