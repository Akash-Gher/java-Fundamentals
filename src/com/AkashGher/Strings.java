package com.AkashGher;
//Strings operations
public class Strings {
    public static void main(String[] args) {
        //string length
        String name ="Akash";
        System.out.println(name.length());

        //String Concatenation

        String name1 = "AKash";
        String name2 = "Sky";
        String name3 =name1 + name2;
        System.out.println(name3);

        //String Concatenation with strings


        String name4 =name1 + " and "+name2;
        System.out.println(name4);

        // Character position in String

        String name5="Saurabh";
        System.out.println(name5.charAt(1));
        System.out.println(name5.length());

        //Replace

        String name6="Aadarsh";
        String name7=name6.replace('A','S');
        System.out.println(name6);
        System.out.println(name7);

        //Substring

        String name8="Akash and Sky";
        System.out.println(name8.substring(6,9));




    }
}
