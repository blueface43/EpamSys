package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b,c,z;
        System.out.println("Enter a,b,c: ");
        a= scanner.nextFloat();
        b= scanner.nextFloat();
        c= scanner.nextFloat();
        z=((a-3)*b/2)+c;
        System.out.println("Value z="+z);
    }
}
