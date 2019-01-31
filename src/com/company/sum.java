package com.company;

import java.util.Scanner;

public class sum {
    //Have the user enter a number and print the sum of all numbers from that inputted value to 1
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Input a number");
        int number = Keyboard.nextInt();
        int sum_num =0;

        for (int i=number; i>=1; i--){
            sum_num +=i;
//            System.out.println(i);

        }
        System.out.println(sum_num);
    }
}

