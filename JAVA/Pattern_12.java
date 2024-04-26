import java.util.Scanner;

public class Pattern_12 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System. in );

    System.out.println("Enter the number of rows : ");

    int n = sc.nextInt();

    int x = 1;
    int y = 1;
    int z = 1;

    for (int i = 0; i < n; i++) {
      for (int k = n - 1; k >= i; k--) {
        System.out.print(" ");
      }

      for (int j = 0; j < y; j++) {

        if (i == j) {

          z = (x + 1) * (j + j);
          z = (z == 0) ? 1 : z;
          System.out.print(" " + z);
          continue;
        }
        x = x + 2;
        System.out.print(" " + x);
      }
      y = y + 2;
      System.out.println();
      sc.close();
    }
  }
}