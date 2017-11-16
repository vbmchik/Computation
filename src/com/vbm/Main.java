package com.vbm;

import java.util.Scanner;

public class Main {

    public static void  main( String... args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression: ");

        String expr = sc.next();

        try {
            System.out.println(Espresso.calculus(expr));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
