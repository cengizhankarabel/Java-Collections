package HashMap_Iterator_ForEach;

/*

    ---> Write a program to iterate the HashMap ?

 */

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

        // Creating a HashMap of String keys and String values
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("1","Houston");
        hashMap.put("2","Austin");
        hashMap.put("3","Dallas");

        for (String key: hashMap.keySet()){
            System.out.println("Key: "+key+" value: "+hashMap.get(key));
        }
    }
}
