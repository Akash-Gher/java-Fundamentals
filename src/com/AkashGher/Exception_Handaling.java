package com.AkashGher;

public class Exception_Handaling {
    public static void main(String[] args) {

        int[] marks={97,98,95};

        try{
            System.out.println(marks[5]);
        }
        catch (Exception exception)
        {
            //do something after catching exception

        }
        System.out.println("The name is Akash");


    }
}
