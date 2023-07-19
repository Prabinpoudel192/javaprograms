import java.util.*;

public class Jagged {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0] = new int[]{1, 2, 3, 4};
        a[1] = new int[]{5, 6};
        a[2] = new int[]{7, 8, 9};

        System.out.println("The Array you entered will be displayed Below:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int[] sum = new int[3]; // Array to store the sum of each row
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i] += a[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("Sum of the elements of Row %d is %d\n", i + 1, sum[i]);
        }
    }
}
