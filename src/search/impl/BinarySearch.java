package search.impl;

import search.Search;
import sort.Sort;
import sort.impl.HeapSort;

public class BinarySearch implements Search {
    @Override
    public int search(int[] a, int key) {
        sort(a);

        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int middle = (left + right) / 2;
            if (a[middle] == key) {
                return middle;
            }
            if (a[middle] < key) {
                left = middle + 1;
            } else if (a[middle] > key) {
                right = middle - 1;
            }
        }
        return -1;
    }

    private int[] sort(int[] a) {
        Sort sort = new HeapSort();
        sort.sort(a);
        return a;
    }

}
