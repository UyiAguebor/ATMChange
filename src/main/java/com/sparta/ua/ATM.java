package com.sparta.ua;

import java.util.Scanner;


public class ATM
{
    public static void main( String[] args ) {
        int fifty = 12;
        int twenty = 20;
        int ten = 50;
        int five = 100;
        int two = 250;
        int one = 500;

        Scanner value = new Scanner(System.in);

        System.out.println("Please enter an amount:");
        int amount  = value.nextInt();

        getChange(amount);
        value.close();


    }

    public static String getChange(int amount){

        int fifty = 12;
        int twenty = 20;
        int ten = 50;
        int five = 100;
        int two = 250;
        int one = 500;

        while(amount != 0){

            if(amount - 50 >= 0){
                amount -= 50;
                fifty -= 1;
            }
            else if (amount - 20 >= 0) {
                amount -= 20;
                twenty -= 1;
            }
            else if (amount - 10 >= 0) {
                amount -= 10;
                ten -= 1;
            }
            else if (amount - 5 >= 0) {
                amount -= 5;
                five -= 1;
            }
            else if (amount - 2 >= 0) {
                amount -= 2;
                two -= 1;
            }
            else if (amount - 1 >= 0) {
                amount -= 1;
                one -= 1;
            }
        }


        String result = "Amount of £50 notes: " + fifty + "\n" +
                "Amount of £20 notes: " + twenty + "\n" +
                "Amount of £10 notes: " + ten + "\n" +
                "Amount of £5 notes: " + five + "\n" +
                "Amount of £2 notes: " + two + "\n" +
                "Amount of £1 notes: " + one;

        System.out.println(result);
        return result;
    }
}
