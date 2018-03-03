package com.sda.sorting;

public class BubbleSort {
    public static void sort(int[] tablica) {
        int n = tablica.length;
        int licznik =0;
        do {
            for (int i = 0; i < n-1; i++) {
                if (tablica[i] > tablica[i + 1]) {
                    licznik++;
                    int temp = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = temp;
                }
            }
            n--;
        } while (n>1);
        System.out.println(licznik);
    }
}

//    int[] tablica = new int[] { 18, 20, 72, 3, 5, 70, -5};