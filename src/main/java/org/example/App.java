package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //get PRINCIPAL

        Scanner p = new Scanner(System.in);
        System.out.println("What is the principal?");
        float principal = p.nextFloat();
        System.out.println(principal);
        //get RATE

        Scanner r = new Scanner(System.in);
        System.out.println("What is the rate of interest?");
        float rate = r.nextFloat();

        System.out.println(rate);

        //get TIME

        Scanner t = new Scanner(System.in);
        System.out.println("What is the time in years?");
        float time = t.nextFloat();
        System.out.println(time);

        float A = (1+((rate/100)*time)) * principal;
        double roundA = Math.round(A * 100.0) / 100.0;
        System.out.printf("After %.2f years at %.2f%%, the investment will be worth $%.2f",time,rate,roundA);
    }
}