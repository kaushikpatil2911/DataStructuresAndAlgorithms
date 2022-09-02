package com.code;

import java.util.*;

public class Marks{

    public static void main(String[] args) throws Exception{

        Scanner scn = new Scanner(System.in);
        int[] marks = new int[5];
        for(int i=0; i<marks.length; i++){
            marks[i] = scn.nextInt();
        }

        System.out.println(Arrays.toString(marks));

    }

}