package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 1 +4 + 16 + 64;
        int b = 2 + 8 + 32 + 128;
        System.out.println("a: " + Integer.toBinaryString(a));
        System.out.println("b: " + Integer.toBinaryString(b));

        System.out.println("a ^ b = " + Integer.toBinaryString(a ^ b));
        System.out.println("a | b = " + Integer.toBinaryString(a | b));
        System.out.println("a & b = " + Integer.toBinaryString(a & b));

        System.out.println("~b = " + Integer.toBinaryString(~b));
        System.out.println("~a = " + Integer.toBinaryString(~a));
    }
}
