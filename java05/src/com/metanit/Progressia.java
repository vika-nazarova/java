package com.metanit;

import java.util.Scanner;

public class Progressia{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int a = in.nextInt();
        // int b = in.nextInt();
        // int c = in.nextInt();
        // System.out.print((b - a) * (c - 1) + 1);
        System.out.print(-(in.nextInt() - in.nextInt()) * (in.nextInt() - 1) + 1);
    }
}

