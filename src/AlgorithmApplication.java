import search.Search;
import search.impl.BinarySearch;
import search.impl.LinearSearch;
import sort.Sort;
import sort.impl.MergeSort;
import util.Utils;

public class AlgorithmApplication {

    public static void main(String[] args) {
        sort();
        search();

        int result = fibo(7);
        System.out.println("Fibo: " + result);
    }

    private static void search() {
        System.out.println("======= SEARCH =======");
        System.out.print("Array: ");
        Utils.print(Utils.arr);

        Search search;
//        search = new LinearSearch();
        search = new BinarySearch();

        int result = search.search(Utils.arr, 5);
        System.out.println("Search result: " + result);
    }

    private static void sort() {
        System.out.println("======= SORT =======");
        Sort sortAlgorithm;

        System.out.print("Array: ");
        Utils.print(Utils.arr);

//        sortAlgorithm = new BubbleSort();
//        sortAlgorithm = new QuickSort();
//        sortAlgorithm = new InsertionSort();
//        sortAlgorithm = new SelectionSort();
//        sortAlgorithm = new HeapSort();
        sortAlgorithm = new MergeSort();

        sortAlgorithm.sort(Utils.arr);

        Utils.print(Utils.arr);
    }

    private static int fibo(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

}
