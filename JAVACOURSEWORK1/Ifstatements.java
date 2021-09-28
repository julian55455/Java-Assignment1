package com.example;

public class Ifstatements {
    public static void main(String[] args)
    {
        int a=75;
        if (a>80){
            System.out.println("Excellent performance");
        }
        else if (a<50){
            System.out.println("Poor performance");
        }
        else if (a<95 && a>50){
            System.out.println("Average performance");
        }
    }
}
