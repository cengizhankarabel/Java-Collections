package ArrayList_Size;

/*

    ---> Write a program to find the length of the ArrayList?
       Using ArrayList.size() method

 */

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        System.out.println("List size before adding : "+arrayList.size());
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("List size after adding : "+arrayList.size());
        arrayList.remove(2);
        arrayList.remove(3);
        System.out.println("List size after removing : "+arrayList.size());

        for(Integer num: arrayList){
            System.out.println(num);
        }



    }
}
