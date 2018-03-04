package com.sda.zadania;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie4 {
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
            System.out.println(liczba + "! wynosi: " + factorialRecursive(liczba));
        }
    }

    public static int factorialRecursive(int n){
        if(n==0 | n==1){
            return 1;
        } else{
            return n*factorialRecursive(n-1);
        }
    }
}
