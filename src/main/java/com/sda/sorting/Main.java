package com.sda.sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tablica = new int[] { 18, 20, 72, 3, 5, 70, 254};
//        BubbleSort.sort(tablica);
//        System.out.println(Arrays.toString(tablica));
//        CountingSort.sort(tablica);
        InsertionSort.sort(tablica);
        System.out.println(Arrays.toString(tablica));
    }
}
