package util;

public class Utils {

  public static final int[] arr = {8, 5, 9, 4, 7, 2, 6, 1, 0, 3};
  public static final int[] arrHappy = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//    public static final int[] arr = {64, 34, 25, 12, 22, 11, 90};


  public static void print(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
  }

}
