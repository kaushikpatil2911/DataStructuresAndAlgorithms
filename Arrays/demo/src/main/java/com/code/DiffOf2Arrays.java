package com.code;

import java.util.*;

public class DiffOf2Arrays {

public static void main(String[] args) throws Exception{

    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the value of n1 : ");
    int n1 = scn.nextInt();
    int[] array1 = new int[n1];
    System.out.println("Enter the array 1 numbers :");
    for(int i=0; i<n1; i++){
        array1[i] = scn.nextInt();
    }

    System.out.println("Enter the value of n2 : ");
    int n2 = scn.nextInt();
    int[] array2 = new int[n2];
    System.out.println("Enter the array 2 numbers :");
    for(int i=0; i<n2; i++){
        array2[i] = scn.nextInt();
    }

    int[] diff = new int[n1];

    int r = 0;

    int i = array1.length - 1;
    int j = array2.length - 1;
    int k = diff.length - 1;

    while(k >= 0){

        int d = 0;
        int a2val = (j >= 0 ? array2[j] : 0);

        if(array1[i] + r >= a2val){
            d = array1[i] + r - a2val;
            r = 0;
        }
        else{
            d = array1[i] + r + 10 - a2val;
            r = -1;
        }

        diff[k] = d;

        i--;
        j--;
        k--;

    }

    System.out.println("\nDiff of two arrays : ");
    System.out.println(Arrays.toString(diff));  

}    
    
}
