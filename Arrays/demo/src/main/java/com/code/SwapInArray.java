package com.code;

import java.util.*;

public class SwapInArray {

public static void Swap(int[] arr, int a, int b) throws Exception{
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}   

public static void main(String[] args) throws Exception{

    int[] array1 = new int[5];
    Scanner scn = new Scanner(System.in);
    for(int i=0; i<array1.length; i++){
        array1[i] = scn.nextInt();
    }

    System.out.println(Arrays.toString(array1));

    Swap(array1,0,4);

    System.out.println(Arrays.toString(array1));

}
    
}
