package com.AkashGher;

public class Casting {
    public static void main(String[] args) {
        //Implicit casting
        double price=100.00;
        double finalprice=price+18;

        System.out.println(finalprice);

        int p=100;
        int fp=p+18;
        // o/p=118
        System.out.println(fp); //here we lost data after decimal point since we use #Explicit casting
        int p2=100;
        int fp2=p+(int)18.18;

        System.out.println(fp); //here we lost".18" data


    }
}
