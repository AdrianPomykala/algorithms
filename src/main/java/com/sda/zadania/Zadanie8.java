package com.sda.zadania;

import java.util.Stack;

public class Zadanie8 {
    public static void main(String[] args) {
        integerToBinary(156);
    }

    public static void integerToBinary(int n) {
        Stack<Integer> stos = new Stack<Integer>();
        while (n > 0) {
//            System.out.println(n);
//            System.out.println(n % 2);
            if (n % 2 == 0) {
                stos.push(0);
            } else{
                stos.push(1);
            }
            n = (n / 2);
        }
        while (!stos.empty()) {
            System.out.print(stos.pop());
        }
    }
}
