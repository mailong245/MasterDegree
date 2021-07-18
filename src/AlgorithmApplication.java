import sorting.impl.QuickSort;
import util.Utils;

public class AlgorithmApplication {

    public static void main(String[] args) {
        System.out.print("Array: ");
        Utils.print(Utils.arr);

//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.sort(Utils.arr);

        QuickSort quickSort = new QuickSort();
        quickSort.sort(Utils.arr);

        Utils.print(Utils.arr);
    }
}
