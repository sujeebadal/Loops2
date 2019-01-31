package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Have the user input a number and print all numbers from that input value to 1
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Input a number");
        int num = Keyboard.nextInt();

        for (int i=num; i>=1; i--) {
            System.out.println(i);
        }


    }
}
