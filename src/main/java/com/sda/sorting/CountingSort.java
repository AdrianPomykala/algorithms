package com.sda.sorting;

public class CountingSort {
    public static void sort(int[] tablica) {
        int zakres = 255;
        int[] liczniki = new int[zakres];
        for (int i = 0; i < tablica.length; i++) {
            liczniki[tablica[i]]++;
        }
        int j = 0;
        for (int i = 0; i < zakres; i++) {
            for (int k=0; k < liczniki[i];k++){
                tablica[j++] = i;
            }
        }
    }
}
