package com.greatlearning.transaction;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the transcation Array : ");
        int numberOfTransaction = scanner.nextInt();
        int transArray[] = new int[numberOfTransaction];
        System.out.println("Enter the Transactions : ");
        for (int i = 0; i < numberOfTransaction; i++) {
            transArray[i] = scanner.nextInt();
        }
        System.out.println("What is the target needs to be achieved ?");
        int target = scanner.nextInt();

        //Logic
        int checkVar = 0;
        int idx = 1;
        boolean checkCond = false;
        for (int i = 0; i < numberOfTransaction; i++) {
            checkVar += transArray[i];
            idx = idx + i;
            if (checkVar >= target) {
                checkCond = true;
                break;
            }
        }

        if (checkCond) {
            System.out.println("Target is achieved " + idx + " transactions");
        } else {
            System.out.println("Target is not achieved");
        }
    }
}
