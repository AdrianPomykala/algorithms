package com.sda.zadania;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(liczba(n));
    }

    public static int liczba(int wartosc){
        int liczba=0;
        for (int i=wartosc-1; i>2;i--){
            if(wartosc % i == 0){
                return i;
            }
        }
        return -1;
    }
}
