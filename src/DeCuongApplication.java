public class DeCuongApplication {

  public static void main(String[] args) {

    int m = 3;
    int n = 4;

    int array[][] = new int[][]{
        new int[]{4, 5, 7, 8},
        new int[]{2, 3, 5, 9},
        new int[]{3, 6, 1, 5}

    };
    int i, j = 0;

    int arr[][] = new int[n][m];

    for (i = 0; i < n; i++) {
      for (j = i; j < m; j++) {
        int A, B, C, D;
        int Ai, Aj, Bi, Bj, Ci, Cj, Di, Dj;
        Ai = Aj = i;
        Bi = i;
        Bj = j + 1;
        Ci = i + 1;
        Cj = j + 1;
        Di = i + 1;
        Dj = j;

        A = arr[Ai][Aj];
        B = arr[Bi][Bj];
        C = arr[Ci][Cj];
        D = arr[Di][Dj];
        if (A + C == B + D) {
          System.out.print(Ai + "," + Aj + " ");
          System.out.print(Bi + "," + Bj + " ");
          System.out.print(Ci + "," + Cj + " ");
          System.out.println(Di + "," + Dj);
          break;
        }
      }
    }

  }

}
