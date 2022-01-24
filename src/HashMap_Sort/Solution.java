package HashMap_Sort;

/*

    ---> Write a program to sort HashMap by keys ?
        Using TreeMap object

 */

import java.util.HashMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {

        HashMap<Integer, String > hashMapCities = new HashMap<Integer, String>();

//        hashMapCities.put(11, "Houston");
//        hashMapCities.put(22, "Austin");
//        hashMapCities.put(33,"Dallas");
//        hashMapCities.put(44,"ElPaso");
//        hashMapCities.put(55,"Spring");
//        hashMapCities.put(66,"SanAntonio");
//        hashMapCities.put(77,"Waco");
        hashMapCities.put(22,"A");
        hashMapCities.put(55,"B");
        hashMapCities.put(33,"Z");
        hashMapCities.put(44,"M");
        hashMapCities.put(99,"I");
        hashMapCities.put(88,"X");

        hashMapCities.forEach((k,v)-> System.out.println(k+" -> "+v));


        System.out.println(hashMapCities);

        TreeMap<Integer,String> treeMapCities = new TreeMap<Integer,String>();

        treeMapCities.putAll(hashMapCities);

        treeMapCities.forEach((k,v)-> System.out.println(k+" -> "+v));

    }
}
