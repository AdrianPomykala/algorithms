package com.sda.sorting;

import java.util.Arrays;

public class MergeSort {
    static int licznikOperacji=0;
    public static void sort(int[] tablica) {
        // posortuj od indeksu 0 do length-1

        mergeSort(tablica, 0, tablica.length - 1);
        System.out.println(licznikOperacji);
    }

    private static void mergeSort(int[] tablica, int from, int to) {
        if (from == to) {
            return;
        }

        int middle = (to + from) / 2;  // środek zakresu (nie środek tablicy)

        mergeSort(tablica, from, middle); // podział lewej strony
        mergeSort(tablica, middle + 1, to); // podział prawej strony

        // połącz dwie połowy w całość
        // przekazujemy parametry żeby znać pozycję podziału
        merge(tablica, from, middle, to);
    }

    private static void merge(int[] tablica, int from, int middle, int to) {
        int[] copy = Arrays.copyOf(tablica, tablica.length);

        int indexLeft = from;
        int indexRight = middle + 1;
        int pozycjaWstawiania = from;
        // jeśli są elementy w obu podtablicach
        // porównujemy element z tablicy lewej i prawej - dopóki jest co porównywać
        while (indexLeft <= middle && indexRight <= to) {
            licznikOperacji++;
            if (copy[indexLeft] >= copy[indexRight]) {
                tablica[pozycjaWstawiania++] = copy[indexLeft++];
            } else if (copy[indexLeft] < copy[indexRight]) {
                tablica[pozycjaWstawiania++] = copy[indexRight++];
            }
//            pozycjaWstawiania++;
        }

        while (indexLeft <= middle){
            licznikOperacji++;
            tablica[pozycjaWstawiania++] = copy[indexLeft++];
        }
        while (indexRight <= to){
            licznikOperacji++;
            tablica[pozycjaWstawiania++] = copy[indexRight++];
        }
    }
}