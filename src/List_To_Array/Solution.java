package List_To_Array;

/*

    ---> Write a program to convert List to Array?
        Using Arrays.asList() method

 */

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        // ArrayList Declaration and Initialization
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Houston");
        arrayList.add("Austin");
        arrayList.add("Spring");
        arrayList.add("ElPaso");
        arrayList.add("Dallas");
        arrayList.add("Odessa");

        //  List to Array
        String array[] = new String[arrayList.size()];
        for(int i=0; i<array.length; i++){
            array[i] = arrayList.get(i);
        }

        for (String city: array){
            System.out.println(city);
        }



    }
}
