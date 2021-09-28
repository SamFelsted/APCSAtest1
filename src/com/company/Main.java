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
        System.out.println("The product of the two numbers is " + (num1 * num2));
        System.out.println("The average of the two numbers is " + ((double) num1 + num2) / 2);
        System.out.println("The distance between the two is " + Math.abs(num1 - num2));
        int max, min;
        if (num1 > num2){
            max = num1;
            min = num2;
        } else {
            min = num1;
            max = num2;
        }
        System.out.println("The min is " + min);
        System.out.println("The max is " + max);

    }

    public static int safeInput(Scanner read) {
        while (true) {
            try {
                System.out.println("please type in an integer");
                return read.nextInt();
            } catch (Exception e) {
                System.out.print("Error, not an integer, ");
                read.nextLine();
            }
        }
    }
}
