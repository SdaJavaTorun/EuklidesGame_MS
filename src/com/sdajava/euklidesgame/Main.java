package com.sdajava.euklidesgame;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void  Game(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ilość gier: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++ ) {
            System.out.println("Gra numer " + i);
            Random r = new Random();
            int a = r.nextInt(50);
            System.out.println("Rztony gracza A: " + a);
            int b = r.nextInt(50);
            System.out.println("Rzetony gracza B: " + b);
            int suma = 0;

            while (a != b && a != 0 && b != 0) {
                if (a < b) {
                    b = b - a;
                   // System.out.println("1. " + a + " " + b); // sprawdzenie toku gry

                } else {
                    a = a - b;
                  //  System.out.println("2. " + a + " " + b); // sprawdzenie toku gry
                }
            }
            suma = a+b;
            System.out.println("Suma pozostałych rzetownów:  "+  suma + "\n");
        }
    }



    public static void main(String[] args) {
        Main.Game();
    }
}
