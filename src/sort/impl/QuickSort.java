package sort.impl;

import sort.Sort;

public class QuickSort implements Sort {

    @Override
    public void sort(int[] a) {
        System.out.println("--- QUICK SORT ---");
        quickSort(a, 0, a.length - 1);
    }

    private void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int partition = partition(a, low, high);

            quickSort(a, 0, partition - 1);
            quickSort(a, partition, high);
        }
    }

    private int partition(int[] a, int low, int high) {
        int key = a[high];
        int left = low;
        int right = high - 1;
        while (true) {
            while (left <= right && a[left] < key) left++;
            while (right >= left && a[right] > key) right--;
            if (left >= right) break;
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        int temp = a[left];
        a[left] = a[high];
        a[high] = temp;
        return left;
    }

}
