//we can actually initialize the jagged array in two ways.
// 1st method Begning

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
//1st method end
//2nd method begning.
public class Jagged {
public static void main(String[] args){
    int[][] k=new int[][]{{15,25,35,5},{13,11,23},{3,2}};
    
    for(int i=0;i<3;i++){
       int sum=0;
       System.out.println("Elements of row "+(i+1)+" are: ");
        for(int j=0;j<k[i].length;j++){
            System.out.print(k[i][j]+" ");
             sum=sum+k[i][j];
        }
        System.out.println("");
        System.out.println("The sum of row "+(i+1)+" is "+sum );
    }
}    
}
//Second method end.
//There are two codes which are complete in themself. Hence, you have to choose which is better for you.
