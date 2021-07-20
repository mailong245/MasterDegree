package sort.impl;

import sort.Sort;

public class SelectionSort implements Sort {

    @Override
    public void sort(int[] a) {
        System.out.println("--- SELECTION SORT ---");
        int min;
        for (int i = 0; i < a.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                    continue;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }


}
