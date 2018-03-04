package com.sda.zadania;

import java.util.*;

public class Zadanie9 {
    public static void main(String[] args) {
//        STOS
        Stack<Integer> stosA = new Stack<Integer>();
        Stack<Integer> stosB = new Stack<Integer>();
        Stack<Integer> stosC = new Stack<Integer>();
        Stack<Integer> stosD = new Stack<Integer>();
        stosA.add(1);
        stosA.add(3);
        stosA.add(5);
        stosA.add(6);
        stosB.add(2);
        stosB.add(2);
        stosB.add(4);
        stosB.add(7);
        while (!stosA.empty() | !stosB.empty()) {
            if (!stosA.empty() & !stosB.empty()) {
                stosC.push((stosA.peek() >= stosB.peek()) ? stosA.pop() : stosB.pop());
            } else if (!stosA.empty()) {
                stosC.push(stosA.pop());
            } else if (!stosB.empty()) {
                stosC.push(stosB.pop());
            }
        }
        System.out.println(stosC);
        while (!stosC.empty()){
            stosD.push(stosC.pop());
        }
        System.out.println(stosD);
//        KOLEJKA
        Queue<Integer> kolejkaA = new LinkedList<Integer>();
        Queue<Integer> kolejkaB = new LinkedList<Integer>();
        Queue<Integer> kolejkaC = new LinkedList<Integer>();
        Queue<Integer> kolejkaD = new LinkedList<Integer>();
        kolejkaA.add(1);
        kolejkaA.add(3);
        kolejkaA.add(5);
        kolejkaA.add(6);
        kolejkaB.add(2);
        kolejkaB.add(2);
        kolejkaB.add(4);
        kolejkaB.add(7);
        System.out.println(kolejkaA);
        while (kolejkaA.peek()!=null | kolejkaA.peek()!=null) {
            if (kolejkaA.peek()!=null & kolejkaB.peek()!=null) {
                kolejkaC.offer((kolejkaA.peek() >= kolejkaB.peek()) ? kolejkaB.poll() : kolejkaA.poll());
            } else if (kolejkaA.peek()!=null) {
                kolejkaC.offer(kolejkaA.poll());
            } else if (kolejkaB.peek()!=null) {
                kolejkaC.offer(kolejkaB.poll());
            }
        }
        System.out.println(kolejkaC);
        while (kolejkaC.peek()!=null){
            kolejkaD.offer(kolejkaC.poll());
        }
        System.out.println(kolejkaD);
    }
}
