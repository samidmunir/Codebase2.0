package com.example.user_input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        sc.close();

        System.out.println("\nWelcome to Java programming, " + name + "!");
    }
}