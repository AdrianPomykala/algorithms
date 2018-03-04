package com.sda.sorting;

import java.util.Arrays;

public class QuickSort {
    private static int counter;

    public static void sort(int[] tablica) {
        counter = 0;
        quickSort(tablica, 0, tablica.length - 1);
//        System.out.println("Counter " + counter);
    }

    private static void quickSort(int[] tablica, int from, int to) {

        int pivot = tablica[(from + to) / 2];
        int j = to;
        int i = from;
        do {
            while (tablica[i] < pivot) {
                counter++;
                i++;
            }
            while (tablica[j] > pivot) {
                counter++;
                j--;
            }

            counter++;
            if (i <= j) {
                int tmp = tablica[i];
                tablica[i] = tablica[j];
                tablica[j] = tmp;
                i++;
                j--;
            }
        } while (i <= j);
        System.out.println(Arrays.toString(tablica));

        if (from < j) {
            quickSort(tablica, from, j);
        }
        if (i < to) {
            quickSort(tablica, i, to);
        }
    }
}