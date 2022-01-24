package HashMap_Initialize;

/*
    ---> HashMap Initialize

 */

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<Integer,String>();

        hashMap.put(1,"Houston");
        hashMap.put(2,"Spring");
        hashMap.put(3,"Austin");

        hashMap.forEach((k,v)-> System.out.println(k+" -> "+v));
    }
}
