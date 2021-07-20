package sort.impl;

import sort.Sort;

public class HeapSort implements Sort {

    private void heapify(int[] a, int n, int i) {
        while (i <= (n / 2) - 1) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int max = left;
            if (right < n && a[max] < a[right]) {
                max = right;
            }
            if (a[max] > a[i]) {
                int temp = a[i];
                a[i] = a[max];
                a[max] = temp;
            }
            i = max;
        }
    }

    void buildHeap(int a[], int n) {
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(a, n, i);
        }
    }

    @Override
    public void sort(int[] a) {
        buildHeap(a, a.length);
        for (int i = a.length - 1; i >= 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i, 0);
        }
    }
}
