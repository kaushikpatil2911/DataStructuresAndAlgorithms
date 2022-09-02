package com.code;

import java.util.*;

public class ArrayManagement {

    public static void main(String[] args) throws Exception{

        Scanner scn = new Scanner(System.in);
        int[] one = new int[5];
        for(int i=0; i<one.length; i++){
            one[i] = scn.nextInt();
        }

        System.out.println(Arrays.toString(one));

        int[] two = one;
        two[1] = 20;

        System.out.println(Arrays.toString(two));

    }
    
}
