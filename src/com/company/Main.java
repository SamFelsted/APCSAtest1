package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner read = new Scanner(System.in);
        int num1 = safeInput(read);
        int num2 = safeInput(read);
        System.out.println("The sum of the two numbers is " + (num1 + num2));
        System.out.println("The difference of the two numbers is " + (num1 - num2));

    }

    public static int safeInput(Scanner read) {
        while (true) {
            try {
                System.out.println("Hello, please type in an integer");
                return read.nextInt();
            } catch (Exception e) {
                System.out.println("Error, not int");
                read.nextLine();
            }
        }
    }
}
