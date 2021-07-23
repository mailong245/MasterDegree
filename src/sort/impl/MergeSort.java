package sort.impl;

import sort.Sort;

/**
 * Sắp xếp trộn
 */
public class MergeSort implements Sort {

    private void merge(int[] a, int l, int m, int r) {
        // VD: a = [7, 8, 2, 6, 9, 5]]
        int i, j, k;

        // Số phần tử từ 0 đến m + 1
        int n1 = m - l + 1;

        // Số phần tử từ m đến a.length
        int n2 = r - m;

        // Tạo mảng con tương ứng với 2 bên left right của mảng cha
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Clone a[0 -> m] sang L[i]
        for (i = 0; i < n1; i++) {
            L[i] = a[l + i];
        }

        // Clone a[m -> a.length -1] sang R[i]
        for (j = 0; j < n2; j++) {
            R[j] = a[m + 1 + j];
        }
        i = j = 0;
        k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

    private void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r ) / 2;

            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);

            merge(a, l, m, r);
        }
    }


    @Override
    public void sort(int[] a) {
        int left = 0;
        int right = a.length - 1;
        mergeSort(a, left, right);
    }
}
