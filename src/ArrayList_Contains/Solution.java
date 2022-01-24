package ArrayList_Contains;

/*
    ---> ArrayList_Contains()
Given an element write a program to check if element(value) exists in ArrayList?

 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        while (n-- > 0){
            arrayList.add(scanner.nextInt());
        }
        System.out.println("enter exist number..");
        Integer num = scanner.nextInt();

        if(arrayList.contains(num)){
            System.out.println(num+" found in the list");
        }else{
            System.out.println(num+" not found in the list");
        }

    }
}
