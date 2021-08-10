import hashtable.Employee;
import hashtable.SimpleHashtable;
import search.Search;
import search.impl.BinarySearch;
import sort.Sort;
import sort.impl.MergeSort;
import sort.impl.SelectionSort;
import util.Utils;

@SuppressWarnings({"java:S1854", "java:S1192", "java:S106", "java:S125", "java:S1481"})
public class AlgorithmApplication {

  public static void main(String[] args) {
    sort();
    search();
    hashTable();
  }

  /**
   * Hashtable algorithm
   */
  private static void hashTable() {
    Employee janeJones = new Employee("Jane", "Jones", 123);
    Employee johnDoe = new Employee("John", "Doe", 4567);
    Employee marySmith = new Employee("Mary", "Smith", 22);
    Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
    Employee billEnd = new Employee("Bill", "End", 78);

    SimpleHashtable ht = new SimpleHashtable();
    ht.put("Jane", janeJones);
    ht.put("John", johnDoe);
    ht.put("Mary", mikeWilson);
    ht.put("Mike", marySmith);

    ht.printHashtable();

    System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
    System.out.println("Retrieve key Smith: " + ht.get("Smith"));

    ht.remove("Wilson");
    ht.remove("Jones");
    ht.printHashtable();

    System.out.println("Retrieve key Smith: " + ht.get("Smith"));
  }

  /**
   * Search algorithm
   */
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

  /**
   * Sort algorithm
   */
  private static void sort() {
    System.out.println("======= SORT =======");
    Sort sortAlgorithm;

    System.out.print("Array: ");
    Utils.print(Utils.arr);

//        sortAlgorithm = new BubbleSort();
//        sortAlgorithm = new QuickSort();
//        sortAlgorithm = new InsertionSort();
        sortAlgorithm = new SelectionSort();
//        sortAlgorithm = new HeapSort();
//    sortAlgorithm = new MergeSort();

    sortAlgorithm.sort(Utils.arr);

    Utils.print(Utils.arr);
  }

  /**
   * Recursive example
   */
  private static int fibo(int n) {
    if (n <= 2) {
      return 1;
    } else {
      return fibo(n - 1) + fibo(n - 2);
    }
  }

}
