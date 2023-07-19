import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of days you want to convert:");
        int k = sc.nextInt();
        int year = k / 365;
        int remainingDays = k % 365;
        int month = remainingDays / 30;
        int days = remainingDays % 30;
        System.out.println("The converted value is Year=" + year + " Month=" + month + " and Days=" + days);
    }
}
