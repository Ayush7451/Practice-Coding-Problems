
import java.util.Arrays;
import java.util.Scanner;
public class duplicate {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int[] arr = {2,3,5,3,4,5,3,6,3,9};
 System.out.print("Enter the number: ");
 int n = sc.nextInt();
 int[] result = new int[arr.length];
 int k = 0;
 for (int i = 0; i < arr.length; i++) {
 if (arr[i] == n) {
 result[k++] = arr[i];
 }
 }
 for (int i = 0; i < arr.length; i++) {
 if (arr[i] != n) {
 result[k++] = arr[i];
 }
 }
 System.out.println(Arrays.toString(result));
 sc.close();
 }
}
