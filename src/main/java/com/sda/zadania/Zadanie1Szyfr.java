package com.sda.zadania;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie1Szyfr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tekst = sc.nextLine().trim();
        String[] slowa = tekst.split(" ");
        List<String> slowa1 = new ArrayList<String>();
        List<String> slowa2 = new ArrayList<String>();
        String[] wyraz = slowa[1].split("");
        if(slowa[0].equals("szyfruj")){
            for (int i = 0; i < wyraz.length; i++) {
                if(i % 2 ==0){
                    slowa1.add(wyraz[i]);
                } else {
                    slowa2.add(wyraz[i]);
                }
            }
            for (String el: slowa1) {
                System.out.print(el);
            }
            for (String el: slowa2) {
                System.out.print(el);
            }
        } else if (slowa[0].equals("odszyfruj")){
            int j = 0;
            for (int i = 0; i <= wyraz.length; i++) {
                if(i>=wyraz.length){
                    break;
                }
                System.out.print(wyraz[i]);
                if(i>(wyraz.length/2)){
                    i = i-wyraz.length/2-1;
                } else {
                    i = i+wyraz.length/2;
                }
            }
        } else {
            System.out.println("Zła komenda");
        }

    }
}
