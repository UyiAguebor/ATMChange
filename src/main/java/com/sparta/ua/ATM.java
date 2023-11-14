package com.sparta.ua;

import java.util.Scanner;


public class ATM
{
    public static void main( String[] args ) {

        Scanner value = new Scanner(System.in);

        System.out.println("Please enter an amount:");
        int amount  = value.nextInt();

        withdrawValue(amount);
        getChange(amount);
        value.close();

    }

    public static void withdrawValue(int amount){
        int[] notes = {50, 20, 10, 5, 2, 1};
        int[] times = new int[6];
        int[] amountOfNotes = {12, 20, 50, 100, 250, 500};

        for(int i = 0;i < notes.length;i++){
            times[i] = amount/notes[i];
            amount -= notes[i]*times[i];
        }

        for(int j = 0;j < times.length;j++){
            System.out.println(times[j]+ " " + "x" + " " + notes[j]);
        }
        System.out.println("------------------------------------------");

        System.out.println("Value || Quantity of units");
        for(int k = 0;k < notes.length;k++){
            amountOfNotes[k] -= times[k];
            System.out.println(notes[k] + "  " + amountOfNotes[k]);
        }


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
