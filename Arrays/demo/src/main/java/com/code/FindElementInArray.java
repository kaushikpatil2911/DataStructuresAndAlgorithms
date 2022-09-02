package com.code;

import java.util.*;

public class FindElementInArray {

public static void main(String[] args) throws Exception{
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the value of n : ");
    int n = scn.nextInt();
    int[] array = new int[n];
    System.out.println("Enter the "+n+" numbers : ");
    for(int i=0; i<n; i++){
        array[i] = scn.nextInt();
    }

    System.out.print("Enter the number to be found : ");
    int d = scn.nextInt();

    for(int i=0; i<n; i++){
        if(d==array[i]){
            System.out.println("The  number has been found on position : "+i);
            return;
        }
    }
    
    System.out.println("Number not found");

}    
    
}
