package com.code;

import java.util.Scanner;

public class MinMaxDiff {

public static void main(String[] args) throws Exception{

    int[] array = new int[5];
    Scanner scn = new Scanner(System.in);
    for(int i=0; i<array.length; i++){
        array[i] = scn.nextInt();
    }

    int max = array[0];
    int min = array[0];
    for(int i = 0; i<array.length; i++){
        if(array[i] < min){
            min = array[i];
        }
        if(array[i] > max){
            max = array[i];
        }
        
    }

    System.out.println("The difference of max = "+max+" and min = "+min+" : "+(max-min));

}
    
}
