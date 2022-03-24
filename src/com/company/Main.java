package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Generating random numbers
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (100-1)); // storing random integers in an array
            System.out.println(arr[i]);
        }
        int smallest = arr[0];
        int biggest = arr[0];
        //Comparing random numbers
        for(int i=1; i< arr.length; i++)
        {
            if(arr[i] > biggest)
                biggest = arr[i];
            else if (arr[i] < smallest)
                smallest = arr[i];

        }
        System.out.println();
        System.out.println("Largest Number is : " + biggest + " and Smallest Number is : " + smallest);


    }
}
