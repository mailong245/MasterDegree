package sort.impl;

import sort.Sort;

public class BubbleSort implements Sort {
    @Override
    public void sort(int[] a) {
        System.out.println("--- BUBBLE SORT ---");
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
