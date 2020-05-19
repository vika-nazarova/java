package com.metanit;

import java.util.Scanner;

public class Queens{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a * a - a - (a - 1) * 2);
    }
}

