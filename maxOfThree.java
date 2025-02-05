import java.util.Scanner;

public class maxOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println(pick(A, B, C));

    }

    static int pick(int num1, int num2, int num3) {
        int rev1 = reverse(num1);
        int rev2 = reverse(num2);
        int rev3 = reverse(num3);
        int sum = 0;

        while (rev1 != 0) {
            int r1 = rev1 % 10;
            int r2 = rev2 % 10;
            int r3 = rev3 % 10;
            sum = (sum * 10) + maximum(r1, r2, r3);

            rev1 /= 10;
            rev2 /= 10;
            rev3 /= 10;

        }
        return sum;
    }

    static int reverse(int n) {
        int revNum = 0;

        while (n != 0) {

            revNum = (revNum * 10) + n % 10;
            n /= 10;
        }
        return revNum;
    }

    static int maximum(int x, int y, int z) {
        int max = -1;
        if (x >= y && x >= z) {
            max = x;
        } else if (y >= x && y >= z) {
            max = y;
        } else {
            max = z;
        }
        return max;
    }
}
