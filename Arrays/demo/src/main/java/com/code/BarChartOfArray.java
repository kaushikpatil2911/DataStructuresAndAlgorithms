package com.code;

import java.util.*;

public class BarChartOfArray {

public static void main(String[] args) throws Exception{

    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the values of n : ");
    int n = scn.nextInt();
    int[] array = new int[n];
    System.out.println("Enter the numbers : ");
    for(int i=0; i<n; i++){
        array[i] = scn.nextInt();
    }
    int max = array[0];
    for(int i=0; i<n; i++){
        if(array[i] > max){
            max = array[i];
        }
    }

    for(int floor=max; floor>=0; floor--){
        for(int i=0; i<n; i++){
            if(array[i]>floor){
                System.out.print("*\t");
            }
            else {
                System.out.print("\t");
            }
    }
    System.out.println();

}    
    
}
}
