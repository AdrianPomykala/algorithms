package com.sda.zadania;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String slowo = sc.nextLine().trim().replaceAll(" ","");
        String[] slowoPodz = slowo.split("");
        String temp;
        for (int i = 1; i < slowoPodz.length-1; i=i+2) {
            temp = slowoPodz[i];
            slowoPodz[i]=slowoPodz[i+1];
            slowoPodz[i+1]=temp;
        }
        for (String el: slowoPodz) {
            System.out.print(el);
        }
    }
}
