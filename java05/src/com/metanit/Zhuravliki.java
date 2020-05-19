package com.metanit;

import java.util.Scanner;

public class Zhuravliki{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.printf("%d %d %d\n", a / 6, a / 6 * 4, a / 6);
    }
}

