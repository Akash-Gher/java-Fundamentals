package com.AkashGher;
import  java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //To take input from user we needto use Scanner class and import it first

        //create object of scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your age: ");
        int age=sc.nextInt();
        System.out.println(age);


        //To input String
        System.out.print("Input your Name: ");
        String name =sc.next();
        System.out.print(name); //only one token is displayed

        String name2 =sc.nextLine();
        System.out.println(name2);  //here we get complete String



    }
}
