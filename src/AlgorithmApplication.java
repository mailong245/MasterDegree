import sorting.impl.HeapSort;
import sorting.impl.InsertionSort;
import sorting.impl.QuickSort;
import sorting.impl.SelectionSort;
import util.Utils;

public class AlgorithmApplication {

    public static void main(String[] args) {
        System.out.print("Array: ");
        Utils.print(Utils.arr);

//        BubbleSort bubbleSort = new BubbleSort();
//        QuickSort sortAlgorithm = new QuickSort();
//        InsertionSort sortAlgorithm = new InsertionSort();
//        SelectionSort sortAlgorithm = new SelectionSort();

        HeapSort sortAlgorithm = new HeapSort();
        sortAlgorithm.sort(Utils.arr);

        Utils.print(Utils.arr);
    }
}
