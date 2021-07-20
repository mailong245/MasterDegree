import sorting.impl.HeapSort;
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

    int result = fibo(7);
    System.out.println("Fibo: " + result);
  }

  private static int fibo(int n) {
    if (n <= 2) {
      return 1;
    } else {
      return fibo(n - 1) + fibo(n - 2);
    }
  }

}
