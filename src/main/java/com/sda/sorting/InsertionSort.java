package com.sda.sorting;

public class InsertionSort {
    public static void sort(int[] tablica) {
        for (int i = 1; i < tablica.length; i++) {
            int tmp = tablica[i];
            int j = i - 1;
            while (j >= 0 && tablica[j] > tmp) {
                tablica[j + 1] = tablica[j];
                j--;
            }
            tablica[j+1] = tmp;
        }
    }
}
