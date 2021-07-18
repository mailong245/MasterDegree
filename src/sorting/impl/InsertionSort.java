package sorting.impl;

import sorting.Sort;

public class InsertionSort implements Sort {

    @Override
    public void sort(int[] a) {
        System.out.println("--- INSERTION SORT ---");
        int i, j, key;
        for (i = 1; i < a.length; i++) {
            key = a[i];
            j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

}
