package HashSet_Contains;

import java.util.HashSet;
import java.util.Scanner;

/*
    ---> HashSet_Contains()
Given an element write a program to check if element exists in HashSet?

 */
public class Solution {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<Integer>();

        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        while (n-- > 0){
            hs.add(scanner.nextInt());
        }

        System.out.println("enter exist number..");
        Integer num = scanner.nextInt();

        if(hs.contains(num)){
            System.out.println(num+" found in the list");
        }else{
            System.out.println(num+" not found in the list");
        }
    }
}
