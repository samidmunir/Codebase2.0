package com.example.simple_calculator;

import java.util.Arrays;

public class Main {
    /*
        You are asked to develop a simple calculator that supports some arithmetic operations on integers.

        Supported Operations:
        * Addition (add)
        * Subtraction (sub)
        * Multiplication (mul)
        * Division (div)
        
        Input Format:
        * Two arrays
            1. input1: An array of integers (operands)
            2. input2: An array of strings (operators)

        Example 1):
         input1 = [5, 6, 14, 7]
         input2 = ["add", "sub", "div"]
         Output = 9
        
        Evaluation Rules
        * The calculator must respect operator precedence.
        * The Result should always be an integer.
            > If the result is a decimal, return the floor of the value (round down).
        
        Assumptions
        1. No parentheses will be used in the input.
        2. The input will always be valid.
        3. input2.length == input1.length - 1
    */
    public static void main(String[] args) {
        System.out.println("\nSimple Calculator Program\n------------------------");
        
        SimpleCalculator sc = new SimpleCalculator();
        System.out.println("\nExample 1)");
        int[] input1 = {5, 6, 14, 7};
        String[] input2 = {"add", "sub", "div"};
        System.out.println("input1: " + Arrays.toString(input1));
        System.out.println("input2: " + Arrays.toString(input2));
        System.out.println("Output: " + sc.calculate(input1, input2));
    }
}