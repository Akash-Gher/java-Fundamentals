package com.AkashGher;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic operator

        //Ex.1
        int a=10;
        int b=3;

        int sum=a+b;
        System.out.println(sum);

        int diff=a-b;
        System.out.println(diff);

        int mul=a*b;
        System.out.println(mul);

        double div=a/b;
        System.out.println(div ); /* o/p not works for division we need to take double as a data type inorder  to
                                    get complete output*/

        double modulo=a%b;
        System.out.println(modulo);

        //Assignment Operators

        double c=6;//assignment of  6 to 'a' variable
        System.out.println(c);

        //Unary operators

      int  num=1;
        num=num+1;
        System.out.println(num);
        /* Insted of this we can use unary operator */

        //post increment
       int  number=3;
        System.out.println(number);
         number++;
        System.out.println(number);

        //post Decrement

        System.out.println(number);
        number--;
        System.out.println(number);

        //pre increment

        System.out.println(number);
        ++number;
        System.out.println(number);

        //pre decrement

        System.out.println(number);
        --number;
        System.out.println(number);



        //comparison operator

        //a==b
        //a!=b
        //a<b
        //a>b
        //a<=b
        //a>=b

        //Conditional Statement

        //Ex1.
        boolean  isSunUp=true;
        if(isSunUp==true)
            System.out.println("Day");
        else
            System.out.println("Night");

        int age2=30;
        if(age2>18)
            System.out.println("Can vote");
        else
            System.out.println("Can't vote");


        //Logical Operator

        //logical AND
        int aa=30;
        int bb=40;
        if(a<50&&b<50)
            System.out.println("both less than 50");

        //logical OR
        if(a<50||b<50)
            System.out.println("At least one less than 50");

        // logical Not

        /* For true condition*/
        boolean isAdult =true;
        if(isAdult=true)
            System.out.println("is Adult");
        else
            System.out.println("Not Adult");

        /*For False condition */

        boolean isAdult2 =false;
        if(! isAdult2)
            System.out.println("is Adult");
        else
            System.out.println("Not Adult");


    }
}
