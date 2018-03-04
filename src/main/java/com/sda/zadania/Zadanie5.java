package com.sda.zadania;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą dodatnią");
        int liczba=0;
        try {
            liczba = sc.nextInt();
        }catch (InputMismatchException ime){
            System.err.println("Podałeś zły argument");
        }
        if(liczba<0){
            System.out.println("Podałeś liczbę <0");
        }else{
            System.out.println("Wartość " + liczba +". elementu ciągu Fibonacciego to: " + fibonacci(liczba));
        }
    }

    public static int fibonacci(int n){
        if(n==0 )
            return 0;
        else if(n==1){
            return 1;
        } else{
            return fibonacci(n-1)+ fibonacci(n-2);
        }
    }
}