package Day2;


import java.util.*;

public class UniqueDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[10];
        while (n != 0) {
            int r = n % 10;
             if (arr[r] == 1) {
                arr[r]++;
                count++;
            }
            n /= 10;

        }
        System.out.print(count);
        sc.close();
    }

}