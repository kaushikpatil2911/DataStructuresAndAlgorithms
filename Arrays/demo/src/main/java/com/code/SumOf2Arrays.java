package com.code;

import java.util.*;

public class SumOf2Arrays {

public static void main(String[] args) throws Exception{

    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the value of n1 : ");
    int n1 = scn.nextInt();
    int[] array1 = new int[n1];
    System.out.println("Enter the array 1 numbers :");
    for(int i=0; i<n1; i++){
        array1[i] = scn.nextInt();
    }
    System.out.println(Arrays.toString(array1));

    System.out.print("Enter the value of n2 : ");
    int n2 = scn.nextInt();
    int[] array2 = new int[n2];
    System.out.println("Enter the array 2 numbers : ");
    for(int i =0; i<n2; i++){
        array2[i] = scn.nextInt();
    }
    System.out.println(Arrays.toString(array2));

    // if(n1>n2){
    //     ;
    // }
    // else{
    //     int[] a = array1;
    //     array1 = array2;
    //     array2 = a;

    // }

    int[] sum = new int[n1 > n2? n1 : n2];

    // System.out.println(Arrays.toString(array1));
    // System.out.println(Arrays.toString(array2));

    int c = 0;

    int i = array1.length - 1;
    int j = array2.length - 1;
    int k = sum.length - 1;

    while(k >= 0){
        int d = c;

        if(i>=0){
            d = d + array1[i];
        }
        
        if(j>=0){
            d = d + array2[j];
        }

        c = d/10;
        d = d % 10;

        sum[k] = d;

        i--;
        j--;
        k--;

    }

    System.out.println("\nSum of two arrays : ");
    System.out.println(Arrays.toString(sum));

}
    
}
