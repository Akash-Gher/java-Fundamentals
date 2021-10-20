package com.AkashGher;

public class Loops {
    public static void main(String[] args) {

        //for Loop
        for(int i=0;i<101;i++)
        {
            System.out.println(i);
        }

        for(int i2=100;i2>0;i2--)
            System.out.println(i2);


        //while loop

        int j=100;
        while(j>=1){
            System.out.println(j);
            j--;
        }

       //do while

       int k=100;

        do{
            System.out.println(k);
            k--;
        }while (k>=1);

    //Break and continue in loops
        int i3=0;
        while(true) {
            System.out.println(i3);
            i3 = i3 + 1;
            if (i3 > 5) {
                break;
            }
        }

        //continue
        //Ex2. print from 0 to 5 except 3
        int l=0;
        while (true){

            if(l==3){
                l++;
                continue;
            }
            System.out.println(l);
            l++;
                if(l>5){
                    break;
                }
        }



    }
}
