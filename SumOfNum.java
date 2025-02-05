import java.util.*;

public class SumOfNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(check(n));
        sc.close();
    }

    static int check(int a) {
        int sum = 0;
        while (a != 0) {
            int r = a % 10;
            sum += r;
            a /= 10;
            if (a == 0 && sum > 9) {
                a = sum;
                sum = 0;
            }
        }
        return sum;
    }
}
