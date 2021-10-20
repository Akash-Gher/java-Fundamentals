package com.AkashGher;
 // import java.util.Arrays;

public class Arrays {
    public static void main(String[] args) {

       // Creating array method 1 { 1D Array}
        int[] marks = new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=95;

      // System.out.println(marks); arrays variable not directly print in o/p
        System.out.println(marks[2]);

      // Creating array method 2 { 1D Array}

        int[] marks2={99,98,97};
        System.out.println(marks2[0]);


        //Length of Array
        System.out.println(marks.length);

       // Sort -Array

        /* To sort array we need to import java.util.Arrays*/

       // Arrays.sort(marks);

     // #2D Arrays
        int[][] finalmarks={{70,80,90},{95,97,87}};
        System.out.println(finalmarks[0][0]);





    }

}
