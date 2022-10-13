package com.greatlearning.currencydenominations;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Currency Denominations : ");
        int size = sc.nextInt();
        int[] currencies = new int[size];
        System.out.println("Enter the currency denominations : ");
        for (int i = 0; i < size; i++) {
            currencies[i] = sc.nextInt();
        }
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(currencies, 0, currencies.length - 1);

        System.out.println("Enter the amount you want to pay");
        int amountPayable = sc.nextInt();

        System.out.println("Your payment approach in order to pay min number of notes will be : ");
        for (int i = 0; i < currencies.length; i++) {
            if (amountPayable >= currencies[i]) {
                System.out.println(currencies[i] + ":" + amountPayable / currencies[i]);
                amountPayable = amountPayable % currencies[i];
            }
            if (amountPayable == 0) {
                break;
            }
        }
    }


}
