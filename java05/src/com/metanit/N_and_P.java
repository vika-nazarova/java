package com.metanit;

import java.util.Scanner;

public class N_and_P {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("The next number for the number " + a + " is " + (a + 1));
        System.out.print("The previous number for the number " + a + " is " + (a - 1));
    }
}
