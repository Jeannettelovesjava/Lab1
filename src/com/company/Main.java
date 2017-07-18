package com.company;

import java.util.Scanner;

public class Lab1 {

public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    double length;

    double width;

    double area;

    double perimeter;

    String answer = "yes";

    do {
        System.out.println("Enter Length: ");
        length = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter width: ");
        width = scan.nextDouble();
        scan.nextLine();

        area = length * width;
        System.out.println("Area: " + area);

        perimeter = 2 * (length + width);
        System.out.println("Perimeter:" + perimeter);

        System.out.println("Yes to continue");
        answer = scan.nextLine();

        while (answer.equals ("yes"));







    }}
    }


