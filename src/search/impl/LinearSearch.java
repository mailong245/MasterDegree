package search.impl;

import search.Search;

public class LinearSearch implements Search {
    @Override
    public int search(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return a[i];
            }
        }
        return -1;
    }
}
